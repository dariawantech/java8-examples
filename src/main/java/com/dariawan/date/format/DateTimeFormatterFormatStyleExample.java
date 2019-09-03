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
package com.dariawan.date.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterFormatStyleExample {
    
    static void print(String format, String result) {
        System.out.printf("%s: %s\n", format, result);
    }
    
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("*** LocalDate ***");
        print("FULL", DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDate));
        print("LONG", DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDate));
        print("MEDIUM", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(localDate));
        print("SHORT", DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDate));
        
        LocalTime localTime = LocalTime.now();
        System.out.println("\n*** LocalTime ***");
        // print("FULL", DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(localTime));
        // print("LONG", DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(localTime));
        print("MEDIUM", DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(localTime));
        print("SHORT", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(localTime));
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("\n*** LocalDateTime ***");
        print("FULL", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(localDateTime));
        // print("LONG", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(localDateTime));
        print("MEDIUM", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime));
        print("SHORT", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(localDateTime));
    }
}
