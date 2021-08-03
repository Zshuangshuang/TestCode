package org.example.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.OutputStream;

public class JSONUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    /**
     *
     * 将Java对象序列化为Json字符串
     * */
    public static String serialize(Object o){
        try {
            return MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("JSON序列化失败"+o);
        }
    }
    
}
