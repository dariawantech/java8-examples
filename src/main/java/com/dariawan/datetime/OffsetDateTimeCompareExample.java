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
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeCompareExample {

    public static void main(String[] args) {
        OffsetDateTime offsetDT1 = OffsetDateTime.parse("1979-12-09T09:50:25+07:00");
        OffsetDateTime offsetDT2 = OffsetDateTime.parse("1980-04-09T09:50:25+08:00");
        
        LocalDateTime localDT = LocalDateTime.parse("19791209095025", DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        OffsetDateTime localDT3 = OffsetDateTime.of(localDT, ZoneOffset.of("+07:00"));
        
        System.out.println("OffsetDateTime1 after OffsetDateTime2    : " + offsetDT1.isAfter(offsetDT2));
        System.out.println("OffsetDateTime1 before OffsetDateTime2   : " + offsetDT1.isBefore(offsetDT2));
        System.out.println("OffsetDateTime1 equal OffsetDateTime3    : " + offsetDT1.isEqual(localDT3));
        System.out.println("OffsetDateTime2 equal OffsetDateTime3    : " + offsetDT2.isEqual(localDT3));

        System.out.println("OffsetDateTime1 compareTo OffsetDateTime2: " + offsetDT1.compareTo(offsetDT2));
        System.out.println("OffsetDateTime2 compareTo OffsetDateTime1: " + offsetDT2.compareTo(offsetDT1));
        System.out.println("OffsetDateTime1 compareTo OffsetDateTime3: " + offsetDT1.compareTo(localDT3));
        System.out.println("OffsetDateTime3 compareTo OffsetDateTime2: " + localDT3.compareTo(offsetDT2));
    }
}
