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

import java.time.Period;

public class PeriodPlusMinusExample {

    public static void main(String[] args) {
        Period period = Period.parse("P8Y5M5D");
        System.out.println("Period          : " + period);
        
        // Adding/subtracting days
        System.out.println("10 days before  : " + period.minusDays(10));
        System.out.println("15 days later   : " + period.plusDays(15));
        
        // Adding/subtracting months
        System.out.println("12 months before: " + period.minusMonths(12));
        System.out.println("6 months later  : " + period.plusMonths(6));
        
        // Adding/subtracting years
        System.out.println("Minus 10 years  : " + period.minusYears(10));
        System.out.println("Plus 5 years    : " + period.plusYears(5));
        
        // Using Period
        System.out.println("5 days before   : " + period.minus(Period.ofDays(5)));
        System.out.println("10 days later   : " + period.plus(Period.ofDays(10)));
    }
}
