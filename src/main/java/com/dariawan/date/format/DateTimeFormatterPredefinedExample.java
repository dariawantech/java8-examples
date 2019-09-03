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
import java.time.format.FormatStyle;

public class DateTimeFormatterPredefinedExample {
    
    static void print(String format, String result) {
        System.out.printf("%s: %s\n", format, result);
    }
    
    public static void main(String[] args) {
        print("ofLocalizedDate(*)", DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.now()));
        print("ofLocalizedTime(*)", DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(LocalTime.now()));
        print("ofLocalizedDateTime(*)", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
        print("ofLocalizedDateTime(*, *)", DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).format(LocalDateTime.now()));
        
        print("BASIC_ISO_DATE", DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now()));
        print("ISO_LOCAL_DATE", DateTimeFormatter.ISO_LOCAL_DATE	.format(LocalDate.now()));
        print("ISO_OFFSET_DATE", DateTimeFormatter.ISO_OFFSET_DATE.format(OffsetDateTime.now()));
        print("ISO_DATE", DateTimeFormatter.ISO_DATE.format(OffsetDateTime.now()));
        print("ISO_LOCAL_TIME", DateTimeFormatter.ISO_LOCAL_TIME.format(LocalTime.now()));
        print("ISO_OFFSET_TIME", DateTimeFormatter.ISO_OFFSET_TIME.format(OffsetTime.now()));
        print("ISO_TIME", DateTimeFormatter.ISO_TIME.format(OffsetTime.now()));
        print("ISO_LOCAL_DATE_TIME", DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));
        print("ISO_OFFSET_DATE_TIME", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(OffsetDateTime.now()));
        print("ISO_ZONED_DATE_TIME", DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()));
        print("ISO_DATE_TIME", DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now()));
        print("ISO_ORDINAL_DATE", DateTimeFormatter.ISO_ORDINAL_DATE.format(ZonedDateTime.now()));
        print("ISO_WEEK_DATE", DateTimeFormatter.ISO_WEEK_DATE.format(ZonedDateTime.now()));
        print("ISO_INSTANT", DateTimeFormatter.ISO_INSTANT.format(ZonedDateTime.now()));
        print("RFC_1123_DATE_TIME", DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now()));
    }
}
