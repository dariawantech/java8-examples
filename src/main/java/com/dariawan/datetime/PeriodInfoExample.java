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

import java.time.LocalDate;
import java.time.Period;

public class PeriodInfoExample {

    public static void main(String[] args) {
        Period period1 = Period.parse("P10Y5M20D");
        System.out.println("Period1    : " + period1);
        System.out.println("Chronology : " + period1.getChronology());
        System.out.println("TotalMonths: " + period1.toTotalMonths());
        System.out.println("#isNegative: " + period1.isNegative());
        System.out.println("#isZero    : " + period1.isZero());
        
        LocalDate localDate1 = LocalDate.of(1980, 4, 9);
        Period duration2 = Period.between(localDate1, localDate1);
        System.out.println("\nPeriod2    : " + duration2);
        System.out.println("#isNegative: " + duration2.isNegative());
        System.out.println("#isZero    : " + duration2.isZero());
        
        LocalDate localDate2 = LocalDate.of(1979, 12, 9);
        Period duration3 = Period.between(localDate1, localDate2);
        System.out.println("\nPeriod3    : " + duration3);
        System.out.println("#isNegative: " + duration3.isNegative());
        System.out.println("#isZero    : " + duration3.isZero());
    }
}
