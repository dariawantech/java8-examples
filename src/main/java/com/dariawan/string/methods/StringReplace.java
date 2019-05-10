package com.dariawan.string.methods;

public class StringReplace {

    public static void main(String[] args) {
        String str1 = "Winter Is Coming";
        System.out.println(str1.replace(' ', '-'));
        System.out.println(str1.replace("Winter", "Autumn"));
        System.out.println(str1.replace("winter", "autumn"));  // no change - case-sensitive
        
        String str2 = "In Xanadu did Kubla Khan\n" +
                "A stately pleasure-dome decree:\n" +
                "Where Alph, the sacred river, ran";
        System.out.println(str2);
        // replace new line with space
        System.out.println(str2.replaceAll("\\n", " "));
        // replace first new line with space
        System.out.println(str2.replaceFirst("\\n", " "));
        
        String str3 = "Game of Thrones";
        // Only Replace first 'o' with 'i'
        System.out.println(str3.replaceFirst("o", "i"));
    }
}
