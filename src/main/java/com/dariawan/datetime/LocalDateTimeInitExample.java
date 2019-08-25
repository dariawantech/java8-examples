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
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeInitExample {

    public static void main(String[] args) {
        LocalDateTime localDT1 = LocalDateTime.now();
        System.out.println("LocalDateTime1 : " + localDT1);

        LocalDateTime localDT2 = LocalDateTime.now(Clock.systemUTC());
        System.out.println("LocalDateTime2 : " + localDT2);
        
        LocalDateTime localDT3 = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println("LocalDateTime3 : " + localDT3);
        
        LocalDateTime localDT4 = LocalDateTime.of(1980, 4, 9, 20, 15);
        System.out.println("LocalDateTime4 : " + localDT4);
        
        LocalDateTime localDT5 = LocalDateTime.of(1980, Month.APRIL, 9, 20, 15);
        System.out.println("LocalDateTime5 : " + localDT5);
        
        LocalDateTime localDT6 = LocalDateTime.of(1979, 12, 9, 18, 5, 50);
        System.out.println("LocalDateTime6 : " + localDT6);
        
        LocalDateTime localDT7 = LocalDateTime.of(1979, Month.DECEMBER, 9, 18, 5, 50);
        System.out.println("LocalDateTime7 : " + localDT7);
        
        LocalDateTime localDT8 = LocalDateTime.of(1983, 7, 12, 20, 15, 50, 345678900);
        System.out.println("LocalDateTime6 : " + localDT8);
        
        LocalDateTime localDT9 = LocalDateTime.of(1983, Month.JULY, 12, 20, 15, 50, 345678900);
        System.out.println("LocalDateTime7 : " + localDT9);
        
        LocalDateTime localDT10 = LocalDateTime.of(LocalDate.now(), LocalTime.of(15, 50));
        System.out.println("LocalDateTime10: " + localDT10);
        
        LocalDateTime localDT11 = LocalDateTime.ofEpochSecond(1555552018, 456789500, ZoneOffset.UTC);
        System.out.println("LocalDateTime11: " + localDT11);
        
        LocalDateTime localDT12 = LocalDateTime.ofInstant(Instant.ofEpochMilli(324142255123L), ZoneId.systemDefault());
        System.out.println("LocalDateTime12: " + localDT12);
        
        LocalDateTime localDT13 = LocalDateTime.parse("1945-08-17T10:20:45");
        System.out.println("LocalDateTime13: " + localDT13);
        
        LocalDateTime localDT14 = LocalDateTime.parse("20190824155025", DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println("LocalDateTime14: " + localDT14);
    }
}
