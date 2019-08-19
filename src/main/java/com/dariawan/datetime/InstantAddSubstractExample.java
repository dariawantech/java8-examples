/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) 2019 Dariawan <hello@dariawan.com>
 *
 * Creative Commons Attribution-ShareAlike 4.0 International License
 *
 * Under this license, you are free to: # Share - copy and redistribute the
 * material in any medium or format # Adapt - remix, transform, and build upon
 * the material for any purpose, even commercially.
 *
 * The licensor cannot revoke these freedoms as long as you follow the license
 * terms.
 *
 * License terms: # Attribution - You must give appropriate credit, provide a
 * link to the license, and indicate if changes were made. You may do so in any
 * reasonable manner, but not in any way that suggests the licensor endorses you
 * or your use. # ShareAlike - If you remix, transform, or build upon the
 * material, you must distribute your contributions under the same license as
 * the original. # No additional restrictions - You may not apply legal terms or
 * technological measures that legally restrict others from doing anything the
 * license permits.
 *
 * Notices: # You do not have to comply with the license for elements of the
 * material in the public domain or where your use is permitted by an applicable
 * exception or limitation. # No warranties are given. The license may not give
 * you all of the permissions necessary for your intended use. For example,
 * other rights such as publicity, privacy, or moral rights may limit how you
 * use the material.
 *
 * You may obtain a copy of the License at
 * https://creativecommons.org/licenses/by-sa/4.0/
 * https://creativecommons.org/licenses/by-sa/4.0/legalcode
 */
package com.dariawan.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class InstantAddSubstractExample {

    public static void main(String[] args) {
        Instant instant = Instant.parse("1984-08-13T10:15:30.345Z");
        System.out.println("Instant             : " + instant);
        
        // Adding/subtracting seconds
        System.out.println("15 seconds before   : " + instant.minusSeconds(15));
        System.out.println("10 seconds after    : " + instant.plusSeconds(10));
        
        // Adding/subtracting millis
        System.out.println("Minus 45000 millis  : " + instant.minusMillis(45000));
        System.out.println("Plus 10000 millis   : " + instant.plusMillis(10000));
        
        // Adding/subtracting nanos
        System.out.println("Minus 45123456 nanos: " + instant.minusNanos(45123456));
        System.out.println("Plus 111234567 nanos: " + instant.plusNanos(111234567));
        
        // Using MINUTES
        System.out.println("45 minutes before   : " + instant.minus(45, ChronoUnit.MINUTES));
        // Using HOURS
        System.out.println("3 hours before      : " + instant.minus(3, ChronoUnit.HOURS));
        // Using MILLIS also supported
        System.out.println("30000 millis later  : " + instant.plus(30000, ChronoUnit.MILLIS));
        // Using DAYS
        System.out.println("10 days later       : " + instant.plus(10, ChronoUnit.MONTHS));
        
        // Using TemporalAmount - Duration 
        System.out.println("10 seconds before   : " + instant.minus(Duration.ofSeconds(10)));
        // Using TemporalAmount - Period 
        System.out.println("5 days later        : " + instant.plus(Period.ofDays(5)));
    }
}
