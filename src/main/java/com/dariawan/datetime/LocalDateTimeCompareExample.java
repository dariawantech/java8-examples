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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeCompareExample {

    public static void main(String[] args) {
        LocalDateTime localDT1 = LocalDateTime.parse("1979-12-09T09:50:25");
        LocalDateTime localDT2 = LocalDateTime.parse("1980-04-09T09:50:25");
        LocalDateTime localDT3 = LocalDateTime.parse("19791209095025", DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        
        System.out.println("LocalDateTime1 after LocalDateTime2    : " + localDT1.isAfter(localDT2));
        System.out.println("LocalDateTime1 before LocalDateTime2   : " + localDT1.isBefore(localDT2));
        System.out.println("LocalDateTime1 equal LocalDateTime3    : " + localDT1.isEqual(localDT3));
        System.out.println("LocalDateTime3 equal LocalDateTime3    : " + localDT2.isEqual(localDT3));

        System.out.println("LocalDateTime1 compareTo LocalDateTime2: " + localDT1.compareTo(localDT2));
        System.out.println("LocalDateTime2 compareTo LocalDateTime1: " + localDT2.compareTo(localDT1));
        System.out.println("LocalDateTime1 compareTo LocalDateTime3: " + localDT1.compareTo(localDT3));
        System.out.println("LocalDateTime3 compareTo LocalDateTime2: " + localDT3.compareTo(localDT2));
    }
}
