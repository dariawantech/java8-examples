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
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeAddSubstractExample {

    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.parse("1983-07-12T06:30:15+07:00");
        System.out.println("OffsetDateTime      : " + offsetDT);
        
        // Adding/subtracting days
        System.out.println("10 days before      : " + offsetDT.minusDays(10));
        System.out.println("15 days later       : " + offsetDT.plusDays(15));
        
        // Adding/subtracting months
        System.out.println("Minus 4 months      : " + offsetDT.minusMonths(4));
        System.out.println("Plus 5 months       : " + offsetDT.plusMonths(5));
        
        // Adding/subtracting weeks
        System.out.println("Minus 20 weeks      : " + offsetDT.minusWeeks(20));
        System.out.println("Plus 30 weeks       : " + offsetDT.plusWeeks(30));
        
        // Adding/subtracting years
        System.out.println("Minus 12 years      : " + offsetDT.minusYears(12));
        System.out.println("Plus 4 years        : " + offsetDT.plusYears(4));
        
        // Adding/subtracting hours
        System.out.println("12 hours before     : " + offsetDT.minusHours(12));
        System.out.println("6 hours later       : " + offsetDT.plusHours(6));
        
        // Adding/subtracting minutes
        System.out.println("Minus 40 minutes    : " + offsetDT.minusMinutes(40));
        System.out.println("Plus 15 minutes     : " + offsetDT.plusMinutes(15));
        
        // Adding/subtracting seconds
        System.out.println("Minus 30 seconds    : " + offsetDT.minusSeconds(30));
        System.out.println("Plus 20 seconds     : " + offsetDT.plusSeconds(20));
        
        // Adding/subtracting Nanos
        System.out.println("Minus 20000 nanos   : " + offsetDT.minusNanos(20000));
        System.out.println("Plus 340000 nanos   : " + offsetDT.plusNanos(340000));
        
        // Using DAYS
        System.out.println("30 days before      : " + offsetDT.minus(30, ChronoUnit.DAYS));
        // Using WEEKS
        System.out.println("3 weeks before      : " + offsetDT.minus(3, ChronoUnit.WEEKS));
        // Using MONTHS
        System.out.println("6 months later      : " + offsetDT.plus(6, ChronoUnit.MONTHS));
        // Using YEARS
        System.out.println("2 years later       : " + offsetDT.plus(2, ChronoUnit.YEARS));
        
        // Using HOURS
        System.out.println("8 hours before      : " + offsetDT.minus(8, ChronoUnit.HOURS));
        // Using MINUTES
        System.out.println("35 minutes before   : " + offsetDT.minus(35, ChronoUnit.MINUTES));
        // Using SECONDS
        System.out.println("125 seconds later   : " + offsetDT.plus(125, ChronoUnit.SECONDS));
        // Using NANOS
        System.out.println("42357500 nanos later: " + offsetDT.plus(42357500, ChronoUnit.NANOS));
        
        // Using TemporalAmount - Duration 
        System.out.println("60 days before      : " + offsetDT.minus(Duration.ofDays(60)));
        System.out.println("160 minutes before  : " + offsetDT.minus(Duration.ofMinutes(160)));
        System.out.println("2 hours later       : " + offsetDT.plus(Duration.ofHours(2)));
        
        // Using TemporalAmount - Period 
        System.out.println("5 years before      : " + offsetDT.minus(Period.ofYears(5)));
        System.out.println("8 months later      : " + offsetDT.plus(Period.ofMonths(8)));
    }
}
