package com.dariawan.string.methods;

public class StringIsEmpty {

    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = " ";
        String str3 = "";
        String str4 = null;
        System.out.println(str1.isEmpty());  // false
        System.out.println(str2.isEmpty());  // false - length > 0
        System.out.println(str3.isEmpty());  // true
        System.out.println(str4.isEmpty());  // NullPointerException
    }

}
