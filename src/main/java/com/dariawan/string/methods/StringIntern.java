package com.dariawan.string.methods;

public class StringIntern {

    public static void main(String[] args) {
        String str1 = "Do One Thing Well";
        String str2 = "Do One Thing Well";
        String str3 = new String("Do One Thing Well");

        System.out.println(str1 == str2);  // true
        System.out.println(str2 == str3);  // false

        String str4 = str3.intern();
        System.out.println(str1 == str4);  // true
        System.out.println(str3 == str4);  // false
    }
}
