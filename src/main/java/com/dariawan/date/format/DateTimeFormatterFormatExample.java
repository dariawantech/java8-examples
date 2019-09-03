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
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterFormatExample {
    
    static void print(String type, String result) {
        System.out.printf("%s: %s\n", type, result);
    }
    
    public static void main(String[] args) {
        // LocalDate
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        print("LocalDate", formatter1.format(LocalDate.now()));

        // LocalDateTime
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        print("LocalDateTime", formatter2.format(LocalDateTime.now()));

        // LocalTime
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("hh:mm:ss.SSS a");
        print("LocalTime", formatter3.format(LocalTime.now()));
        
        // OffsetDateTime
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a");
        print("OffsetDateTime", formatter4.format(OffsetDateTime.now()));
        
        // OffsetTime
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("hh:mm:ss a xx");
        print("OffsetTime", formatter5.format(OffsetTime.now()));
        
        // ZonedDateTime
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
        print("ZonedDateTime", formatter6.format(ZonedDateTime.now()));
    }
}
