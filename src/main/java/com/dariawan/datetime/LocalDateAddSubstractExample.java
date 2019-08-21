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
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateAddSubstractExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("1980-04-09");
        System.out.println("LocalDate     : " + localDate);
        
        // Adding/subtracting days
        System.out.println("10 days before: " + localDate.minusDays(10));
        System.out.println("15 days later : " + localDate.plusDays(15));
        
        // Adding/subtracting months
        System.out.println("Minus 4 months: " + localDate.minusMonths(4));
        System.out.println("Plus 5 months : " + localDate.plusMonths(5));
        
        // Adding/subtracting weeks
        System.out.println("Minus 20 weeks: " + localDate.minusWeeks(20));
        System.out.println("Plus 30 weeks : " + localDate.plusWeeks(30));
        
        // Adding/subtracting years
        System.out.println("Minus 12 years: " + localDate.minusYears(12));
        System.out.println("Plus 4 years  : " + localDate.plusYears(4));
        
        // Using DAYS
        System.out.println("30 days before: " + localDate.minus(30, ChronoUnit.DAYS));
        // Using WEEKS
        System.out.println("3 weeks before: " + localDate.minus(3, ChronoUnit.WEEKS));
        // Using MONTHS
        System.out.println("6 months later: " + localDate.plus(6, ChronoUnit.MONTHS));
        // Using YEARS
        System.out.println("2 years later : " + localDate.plus(2, ChronoUnit.YEARS));
        
        // Using TemporalAmount - Period 
        System.out.println("5 years later : " + localDate.plus(Period.ofYears(5)));
        // Using TemporalAmount - Duration 
        System.out.println("60 days before: " + localDate.minus(Duration.ofDays(60)));
        
    }
}
