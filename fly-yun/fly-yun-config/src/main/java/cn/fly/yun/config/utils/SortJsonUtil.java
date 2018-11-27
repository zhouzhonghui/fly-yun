package cn.fly.yun.config.utils;

import com.alibaba.fastjson.JSON;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortJsonUtil {
    public static void main(String[] args) {
        String jsonmsg="{}";
        String result=jsonSort(jsonmsg);
        System.out.println(result);
    }

    public static String jsonSort(String json){
        String result="";
        if("{}".equals(json)){
            result="{}";
        }else {
            Map<String,String> map = JSON.parseObject(json,Map.class);
            Map<String, String> resultMap = sortMap(map);
            result=JSON.toJSONString(resultMap);
        }
        return result;
    }

    public static Map<String, String> sortMap(Map<String, String> map) {
	        if (map == null || map.isEmpty()) {
	            return null;
	        }
	        Map<String, String> sortMap = new TreeMap<String, String>(new MapComparator());
	        sortMap.putAll(map);
	        return sortMap;
    }
}

class MapComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
