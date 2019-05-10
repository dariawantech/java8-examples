package com.dariawan.string.methods;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
 
    public static void main(String[] args) {
        List<String> ls = Arrays.asList(new String[]{"programming", "with", "java"});
        System.out.println(String.join("-", ls));

        System.out.println(String.join(" ", "Write", "once", "run", "anywhere"));
    }    
}
