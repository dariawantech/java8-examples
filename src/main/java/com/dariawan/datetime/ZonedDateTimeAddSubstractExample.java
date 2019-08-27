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
import java.time.ZonedDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeAddSubstractExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDT = ZonedDateTime.parse("1984-08-13T18:30:15+08:00[Asia/Singapore]");
        System.out.println("ZonedDateTime       : " + zonedDT);
        
        // Adding/subtracting days
        System.out.println("10 days before      : " + zonedDT.minusDays(10));
        System.out.println("15 days later       : " + zonedDT.plusDays(15));
        
        // Adding/subtracting months
        System.out.println("Minus 4 months      : " + zonedDT.minusMonths(4));
        System.out.println("Plus 5 months       : " + zonedDT.plusMonths(5));
        
        // Adding/subtracting weeks
        System.out.println("Minus 20 weeks      : " + zonedDT.minusWeeks(20));
        System.out.println("Plus 30 weeks       : " + zonedDT.plusWeeks(30));
        
        // Adding/subtracting years
        System.out.println("Minus 12 years      : " + zonedDT.minusYears(12));
        System.out.println("Plus 4 years        : " + zonedDT.plusYears(4));
        
        // Adding/subtracting hours
        System.out.println("12 hours before     : " + zonedDT.minusHours(12));
        System.out.println("6 hours later       : " + zonedDT.plusHours(6));
        
        // Adding/subtracting minutes
        System.out.println("Minus 40 minutes    : " + zonedDT.minusMinutes(40));
        System.out.println("Plus 15 minutes     : " + zonedDT.plusMinutes(15));
        
        // Adding/subtracting seconds
        System.out.println("Minus 30 seconds    : " + zonedDT.minusSeconds(30));
        System.out.println("Plus 20 seconds     : " + zonedDT.plusSeconds(20));
        
        // Adding/subtracting Nanos
        System.out.println("Minus 20000 nanos   : " + zonedDT.minusNanos(20000));
        System.out.println("Plus 340000 nanos   : " + zonedDT.plusNanos(340000));
        
        // Using DAYS
        System.out.println("30 days before      : " + zonedDT.minus(30, ChronoUnit.DAYS));
        // Using WEEKS
        System.out.println("3 weeks before      : " + zonedDT.minus(3, ChronoUnit.WEEKS));
        // Using MONTHS
        System.out.println("6 months later      : " + zonedDT.plus(6, ChronoUnit.MONTHS));
        // Using YEARS
        System.out.println("2 years later       : " + zonedDT.plus(2, ChronoUnit.YEARS));
        
        // Using HOURS
        System.out.println("8 hours before      : " + zonedDT.minus(8, ChronoUnit.HOURS));
        // Using MINUTES
        System.out.println("35 minutes before   : " + zonedDT.minus(35, ChronoUnit.MINUTES));
        // Using SECONDS
        System.out.println("125 seconds later   : " + zonedDT.plus(125, ChronoUnit.SECONDS));
        // Using NANOS
        System.out.println("42357500 nanos later: " + zonedDT.plus(42357500, ChronoUnit.NANOS));
        
        // Using TemporalAmount - Period 
        System.out.println("5 years later       : " + zonedDT.plus(Period.ofYears(5)));
        // Using TemporalAmount - Duration 
        System.out.println("60 days before      : " + zonedDT.minus(Duration.ofDays(60)));
        System.out.println("160 minutes before  : " + zonedDT.minus(Duration.ofMinutes(160)));
        System.out.println("2 hours later       : " + zonedDT.plus(Duration.ofHours(2)));        
    }
}
