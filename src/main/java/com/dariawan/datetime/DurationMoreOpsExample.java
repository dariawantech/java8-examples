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
import java.time.temporal.ChronoUnit;

public class DurationMoreOpsExample {

    public static void main(String[] args) {
        Duration duration = Duration.parse("P1DT5H25M30.456750S");
        System.out.println("Duration            : " + duration);
        
        // Adding/subtracting days
        System.out.println("10 days before      : " + duration.minusDays(10));
        System.out.println("15 days later       : " + duration.plusDays(15));
        
        // Adding/subtracting hours
        System.out.println("12 hours before     : " + duration.minusHours(12));
        System.out.println("6 hours later       : " + duration.plusHours(6));
        
        // Adding/subtracting minutes
        System.out.println("Minus 40 minutes    : " + duration.minusMinutes(40));
        System.out.println("Plus 15 minutes     : " + duration.plusMinutes(15));
        
        // Adding/subtracting seconds
        System.out.println("Minus 30 seconds    : " + duration.minusSeconds(30));
        System.out.println("Plus 20 seconds     : " + duration.plusSeconds(20));
        
        // Adding/subtracting Nanos
        System.out.println("Minus 3000 millis   : " + duration.minusMillis(3000));
        System.out.println("Plus 5000 nanos     : " + duration.plusMillis(5000));
        
        // Adding/subtracting Nanos
        System.out.println("Minus 20000 nanos   : " + duration.minusNanos(20000));
        System.out.println("Plus 340000 nanos   : " + duration.plusNanos(340000));
        
        // Using DAYS
        System.out.println("30 days before      : " + duration.minus(30, ChronoUnit.DAYS));
        // Using HOURS
        System.out.println("8 hours before      : " + duration.minus(8, ChronoUnit.HOURS));
        // Using MINUTES
        System.out.println("35 minutes before   : " + duration.minus(35, ChronoUnit.MINUTES));
        // Using SECONDS
        System.out.println("125 seconds later   : " + duration.plus(125, ChronoUnit.SECONDS));
        // Using MILLIS
        System.out.println("7500 millis later   : " + duration.plus(7500, ChronoUnit.MILLIS));
        // Using NANOS
        System.out.println("42357500 nanos later: " + duration.plus(42357500, ChronoUnit.NANOS));
        
        System.out.println("160 minutes before  : " + duration.minus(Duration.ofMinutes(160)));
        System.out.println("3 hours later       : " + duration.plus(Duration.ofHours(3)));
    }
}
