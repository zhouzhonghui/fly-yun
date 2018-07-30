package cn.fly.yun.config.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by tao on 2018/5/4.
 */
public class RequestJsonUtils {
    public static JSONObject getJsonObject(String json){
        JSONObject jsonObject=null;
        if(StringUtils.hasText(json)) {
            jsonObject=JSONObject.parseObject(json);
        }
        return jsonObject;
    }

    public static Object getParameter(String jsonStr,String param){
        JSONObject jsonObject=getJsonObject(jsonStr);
        Object ob=null;
        if(jsonObject!=null)
         ob=jsonObject.get(param);
        return ob;
    }

    public static String getRequestPayload(HttpServletRequest req) throws Exception{

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = req.getReader();
            char[]buff = new char[1024];

            int len;

            while((len = reader.read(buff)) != -1) {

                sb.append(buff,0, len);
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
        return sb.toString();

    }
}
