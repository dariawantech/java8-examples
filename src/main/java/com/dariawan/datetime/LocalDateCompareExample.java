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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateCompareExample {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.parse("1979-12-09");
        LocalDate localDate2 = LocalDate.parse("1980-04-09");
        LocalDate localDate3 = LocalDate.parse("19791209", DateTimeFormatter.BASIC_ISO_DATE);
        
        System.out.println("LocalDate1 after LocalDate2    : " + localDate1.isAfter(localDate2));
        System.out.println("LocalDate1 before LocalDate2   : " + localDate1.isBefore(localDate2));
        System.out.println("LocalDate1 equal LocalDate3    : " + localDate1.isEqual(localDate3));
        System.out.println("LocalDate3 equal LocalDate3    : " + localDate2.isEqual(localDate3));

        System.out.println("LocalDate1 compareTo LocalDate2: " + localDate1.compareTo(localDate2));
        System.out.println("LocalDate2 compareTo LocalDate1: " + localDate2.compareTo(localDate1));
        System.out.println("LocalDate1 compareTo LocalDate3: " + localDate1.compareTo(localDate3));
        System.out.println("LocalDate3 compareTo LocalDate2: " + localDate3.compareTo(localDate2));
    }
}
