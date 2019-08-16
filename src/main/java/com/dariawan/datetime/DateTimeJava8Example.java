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

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJava8Example {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("java.time.LocalDate: " + localDate);
        
        LocalTime localTime = LocalTime.now();
        System.out.println("java.time.LocalTime: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("java.time.LocalDateTime: " + localDateTime);
        
        Instant instant = Instant.now();
        System.out.println("java.time.Instant: " + instant);
        
        Instant instantPlus24Hours = instant.plusSeconds(24*24*60);
        
        Duration duration = Duration.between(instant, instantPlus24Hours);
        System.out.println("java.time.Duration: " + duration);
        
        LocalDate nextMonth = localDate.plusMonths(1);
        Period period = Period.between(localDate, nextMonth);
        System.out.println("java.time.Period: " + period);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSSZZ VV");
        
        ZonedDateTime dtz1 = localDateTime.atZone(ZoneId.systemDefault());
        System.out.println(fmt.format(dtz1));
        
        ZonedDateTime dtz2 = dtz1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(fmt.format(dtz2));

        ZonedDateTime dtz3 = dtz1.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(fmt.format(dtz3));
    }
}
