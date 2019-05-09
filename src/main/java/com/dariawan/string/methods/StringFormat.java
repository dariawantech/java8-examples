package com.dariawan.string.methods;

import java.util.Locale;

public class StringFormat {

    public static void main(String[] args) {
        String str = "OutOfMemory";

        // %s %d and %n is used to append the string
        System.out.print(String.format("\"%s\" length: %d%n", str, str.length()));

        // pi, the ratio of the circumference of a circle to its diameter
        // using locale as Locale.US
        System.out.println(String.format(Locale.US, "pi = %+10.9f", Math.PI));
        // using locale as Locale.US
        System.out.println(String.format(Locale.FRANCE, "pi = %+10.9f", Math.PI));

        // The '(' numeric flag may be used to format negative numbers with
        // parentheses rather than a minus sign.  Group separators are
        // automatically inserted.
        System.out.print(String.format("Balance: $ %(,.2f%n", 42304.6f));
        System.out.print(String.format("Balance: $ %(,.2f%n", -134.257f));
    }
}
