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

import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class PeriodGetExample {

    public static void main(String[] args) {
        Period period = Period.parse("P3Y6M10D");
        System.out.println("Period: " + period);
        System.out.println("Years : " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days  : " + period.getDays());
        
        System.out.println("YEARS : " + period.get(ChronoUnit.YEARS));
        System.out.println("MONTHS: " + period.get(ChronoUnit.MONTHS));
        System.out.println("DAYS  : " + period.get(ChronoUnit.DAYS));
        
        System.out.println("\n#getUnits():");
        List<TemporalUnit> units = period.getUnits();
        for (TemporalUnit unit : units) {
            System.out.println("- " + unit);
        }  
    }
}
