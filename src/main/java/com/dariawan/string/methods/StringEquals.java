package com.dariawan.string.methods;

public class StringEquals {
 
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Python";
        String str3 = "python";
        String str4 = "Jython";
        System.out.println(str1.equals(str2));  // true -> both String are equal
        System.out.println(str1.equals(str3));  // false
        System.out.println(str1.equals(str4));  // false

        System.out.println(str1.equalsIgnoreCase(str2));  // true -> both String are equal
        System.out.println(str1.equalsIgnoreCase(str3));  // true -> case insensitive
        System.out.println(str1.equalsIgnoreCase(str4));  // false      
    }
}
