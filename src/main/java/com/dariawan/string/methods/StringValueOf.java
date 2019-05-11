package com.dariawan.string.methods;

import java.util.HashMap;
import java.util.Map;

public class StringValueOf {
    
    public static void main(String[] args) {
        System.out.println(String.valueOf(false));
        System.out.println(String.valueOf('L'));
        System.out.println(String.valueOf(new char[] {'J', 'A', 'V', 'A'}));
        System.out.println(String.valueOf(new char[] {'G', 'r', 'o', 'o', 'v', 'y'}, 1, 3));
        System.out.println(String.valueOf(2.35d));
        System.out.println(String.valueOf(3.14f));
        System.out.println(String.valueOf(12));
        System.out.println(String.valueOf(79l));
        
        Map map = new HashMap<String, String>();
        map.put("KEY1", "Value1");
        map.put("KEY2", "Value2");
        System.out.println(String.valueOf(map));
    }
}
