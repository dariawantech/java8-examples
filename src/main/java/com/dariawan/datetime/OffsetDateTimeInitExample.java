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
package com.dariawan.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeInitExample {

    public static void main(String[] args) {
        OffsetDateTime offsetDT1 = OffsetDateTime.now();
        System.out.println("OffsetDateTime1: " + offsetDT1);

        OffsetDateTime offsetDT2 = OffsetDateTime.now(Clock.systemUTC());
        System.out.println("OffsetDateTime2: " + offsetDT2);
        
        OffsetDateTime offsetDT3 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("OffsetDateTime3: " + offsetDT3);
        
        OffsetDateTime offsetDT4 = OffsetDateTime.of(1980, 4, 9, 20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
        System.out.println("OffsetDateTime4: " + offsetDT4);
        
        OffsetDateTime offsetDT5 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(15, 50, 25), ZoneOffset.of("+07:00"));
        System.out.println("OffsetDateTime5: " + offsetDT5);
        
        OffsetDateTime offsetDT6 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+07:00"));
        System.out.println("OffsetDateTime6: " + offsetDT6);
        
        OffsetDateTime offsetDT7 = OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("OffsetDateTime7: " + offsetDT7);
        
        OffsetDateTime offsetDT11 = OffsetDateTime.parse("2019-08-31T15:20:30+08:00");
        System.out.println("OffsetDateTime8: " + offsetDT11);
        
        OffsetDateTime offsetDT12 = OffsetDateTime.parse("1980-04-09T08:20:45+07:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("OffsetDateTime9: " + offsetDT12);
    }
}
