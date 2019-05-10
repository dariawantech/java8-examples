package com.dariawan.string.methods;

public class StringLastIndexOf {
 
    public static void main(String[] args) {
        String s = "Write programs that do one thing and do it well";
        System.out.println(s.lastIndexOf("do"));     // 37
        System.out.println(s.lastIndexOf("do", 30)); // 20
        System.out.println(s.lastIndexOf("do", 10)); // -1 -> not found
        System.out.println(s.lastIndexOf('a'));      // 33
        System.out.println(s.lastIndexOf('a', 20));  // 17
        System.out.println(s.lastIndexOf('b'));      // -1 -> not found        
    }    
}
