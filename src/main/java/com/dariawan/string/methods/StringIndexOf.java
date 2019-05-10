package com.dariawan.string.methods;

public class StringIndexOf {
    
    public static void main(String[] args) {
        String s = "Write programs that do one thing and do it well";
        System.out.println(s.indexOf("do"));     // 20
        System.out.println(s.indexOf("do", 30)); // 37
        System.out.println(s.indexOf("code"));   // -1 -> not found
        System.out.println(s.indexOf('e'));      // 4
        System.out.println(s.indexOf('e', 20));  // 25
        System.out.println(s.indexOf('e', 40));  // 44
        System.out.println(s.indexOf('P', 40));  // -1 -> not found, 'p' case-sensitive  
    }
}
