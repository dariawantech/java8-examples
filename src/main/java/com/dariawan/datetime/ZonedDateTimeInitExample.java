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
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeInitExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDT1 = ZonedDateTime.now();
        System.out.println("ZonedDateTime1 : " + zonedDT1);

        ZonedDateTime zonedDT2 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("ZonedDateTime2 : " + zonedDT2);
        
        ZonedDateTime zonedDT3 = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("ZonedDateTime3 : " + zonedDT3);
        
        ZonedDateTime zonedDT4 = ZonedDateTime.of(1980, 4, 9, 20, 15, 45, 345875000, ZoneId.systemDefault());
        System.out.println("ZonedDateTime4 : " + zonedDT4);
        
        ZonedDateTime zonedDT5 = ZonedDateTime.of(LocalDate.now(), LocalTime.of(15, 50, 25), ZoneId.systemDefault());
        System.out.println("ZonedDateTime5 : " + zonedDT5);
        
        ZonedDateTime zonedDT6 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        System.out.println("ZonedDateTime6 : " + zonedDT6);
        
        ZonedDateTime zonedDT7 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ZonedDateTime7 : " + zonedDT7);
        
        ZonedDateTime zonedDT8 = ZonedDateTime.ofInstant(LocalDateTime.now(), ZoneOffset.UTC, ZoneId.systemDefault());
        System.out.println("ZonedDateTime8 : " + zonedDT8);
        
        ZonedDateTime zonedDT9 = ZonedDateTime.ofLocal(LocalDateTime.now(), ZoneId.systemDefault(), ZoneOffset.UTC);
        System.out.println("ZonedDateTime9 : " + zonedDT9);
        
        ZonedDateTime zonedDT10 = ZonedDateTime.ofStrict(LocalDateTime.now(), ZoneOffset.ofHours(8), ZoneId.of("Asia/Singapore"));
        System.out.println("ZonedDateTime10: " + zonedDT10);
        
        ZonedDateTime zonedDT11 = ZonedDateTime.parse("2017-10-10T18:30:45+01:00[Europe/London]");
        System.out.println("ZonedDateTime11: " + zonedDT11);
        
        ZonedDateTime zonedDT12 = ZonedDateTime.parse("2018-04-22T08:40:15+10:00[Australia/Sydney]", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ZonedDateTime12: " + zonedDT12);
    }
}
