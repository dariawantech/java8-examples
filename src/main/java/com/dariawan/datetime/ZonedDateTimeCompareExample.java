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

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeCompareExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDT1 = ZonedDateTime.parse("1980-08-09T16:45:30+08:00[Asia/Singapore]");
        ZonedDateTime zonedDT2 = ZonedDateTime.parse("1980-08-09T16:45:30+07:00[Asia/Jakarta]");
        ZonedDateTime zonedDT3 = zonedDT1.withZoneSameLocal(ZoneId.of("Asia/Jakarta"));
        
        System.out.println("ZonedDateTime1 after ZonedDateTime2    : " + zonedDT1.isAfter(zonedDT2));
        System.out.println("ZonedDateTime1 before ZonedDateTime2   : " + zonedDT1.isBefore(zonedDT2));
        System.out.println("ZonedDateTime1 equal ZonedDateTime3    : " + zonedDT1.isEqual(zonedDT3));
        System.out.println("ZonedDateTime2 equal ZonedDateTime3    : " + zonedDT2.isEqual(zonedDT3));

        System.out.println("ZonedDateTime1 compareTo ZonedDateTime2: " + zonedDT1.compareTo(zonedDT2));
        System.out.println("ZonedDateTime2 compareTo ZonedDateTime1: " + zonedDT2.compareTo(zonedDT1));
        System.out.println("ZonedDateTime1 compareTo ZonedDateTime3: " + zonedDT1.compareTo(zonedDT3));
        System.out.println("ZonedDateTime3 compareTo ZonedDateTime2: " + zonedDT3.compareTo(zonedDT2));
    }
}
