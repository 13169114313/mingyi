package com.mingyi.common.utils;


import com.mingyi.common.config.Global;
import com.mingyi.common.json.JSON;
import com.mingyi.common.json.JSONObject;
import com.mingyi.common.utils.http.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 获取地址类
 */
public class AddressUtil
{
    private static final Logger log = LoggerFactory.getLogger(AddressUtil.class);

    public static final String IP_URL = "http://ip.taobao.com/service/getIpInfo.php";

    public static String getRealAddressByIP(String ip)
    {
        String address = "XX XX";

        // 内网不查询
        if (IpUtil.internalIp(ip))
        {
            return "内网IP";
        }
        if (Global.isAddressEnabled())
        {
            String rspStr = HttpUtil.sendPost(IP_URL, "ip=" + ip);
            if (StringUtil.isEmpty(rspStr))
            {
                log.error("获取地理位置异常 {}", ip);
                return address;
            }
            JSONObject obj;
            try
            {
                obj = JSON.unmarshal(rspStr, JSONObject.class);
                JSONObject data = obj.getObj("data");
                String region = data.getStr("region");
                String city = data.getStr("city");
                address = region + " " + city;
            }
            catch (Exception e)
            {
                log.error("获取地理位置异常 {}", ip);
            }
        }
        return address;
    }
}
