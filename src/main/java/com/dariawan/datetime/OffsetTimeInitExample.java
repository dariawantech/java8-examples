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

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class OffsetTimeInitExample {

    public static void main(String[] args) {
        OffsetTime offsetTime1 = OffsetTime.now();
        System.out.println("OffsetTime1: " + offsetTime1);

        OffsetTime offsetTime2 = OffsetTime.now(Clock.systemUTC());
        System.out.println("OffsetTime2: " + offsetTime2);
        
        OffsetTime offsetTime3 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("OffsetTime3: " + offsetTime3);
        
        OffsetTime offsetTime4 = OffsetTime.of(20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
        System.out.println("OffsetTime4: " + offsetTime4);
        
        OffsetTime offsetTime5 = OffsetTime.of(LocalTime.of(15, 50, 25), ZoneOffset.of("+07:00"));
        System.out.println("OffsetTime5: " + offsetTime5);
        
        OffsetTime offsetTime6 = OffsetTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("OffsetTime6: " + offsetTime6);
        
        OffsetTime offsetTime7 = OffsetTime.parse("10:15:30+07:00");
        System.out.println("OffsetTime7: " + offsetTime7);
        
        OffsetTime offsetTime8 = OffsetTime.parse("18:30:15+08:00", DateTimeFormatter.ISO_OFFSET_TIME);
        System.out.println("OffsetTime8: " + offsetTime8);
    }
}
