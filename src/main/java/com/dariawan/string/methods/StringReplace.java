/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to:
 * # Share - copy and redistribute the material in any medium or format
 * # Adapt - remix, transform, and build upon the material for any purpose,
 *   even commercially.
 *
 * The licensor cannot revoke these freedoms
 * as long as you follow the license terms.
 *
 * License terms:
 * # Attribution - You must give appropriate credit, provide a link to the
 *   license, and indicate if changes were made. You may do so in any
 *   reasonable manner, but not in any way that suggests the licensor
 *   endorses you or your use.
 * # ShareAlike - If you remix, transform, or build upon the material, you must
 *   distribute your contributions under the same license as the original.
 * # No additional restrictions - You may not apply legal terms or
 *   technological measures that legally restrict others from doing anything the
 *   license permits.
 *
 * Notices:
 * # You do not have to comply with the license for elements of the material in
 *   the public domain or where your use is permitted by an applicable exception
 *   or limitation.
 * # No warranties are given. The license may not give you all of
 *   the permissions necessary for your intended use. For example, other rights
 *   such as publicity, privacy, or moral rights may limit how you use
 *   the material.
 *
 * You may obtain a copy of the License at
 *   https://creativecommons.org/licenses/by-sa/4.0/
 *   https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
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
