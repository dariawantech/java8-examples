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

public class PeriodInitExample {

    public static void main(String[] args) {
        Period period1 = Period.of(1, 6, 10);
        System.out.println("Period1: " + period1);

        Period period2 = Period.ofDays(15);
        System.out.println("Period2: " + period2);
        
        Period period3 = Period.ofWeeks(15);
        System.out.println("Period3: " + period3);
        
        Period period4 = Period.ofMonths(3);
        System.out.println("Period4: " + period4);
        
        Period period5 = Period.ofYears(5);
        System.out.println("Period5: " + period5);
        
        Period period6 = Period.parse("P5Y3M15D");
        System.out.println("Period6: " + period6);        
        
        Period period7 = Period.between(LocalDate.of(1979, 12, 9), LocalDate.of(1980, 4, 9));
        System.out.println("Period7: " + period7);
    }
}
