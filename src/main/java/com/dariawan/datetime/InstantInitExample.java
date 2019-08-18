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

public class InstantInitExample {

    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        System.out.println("Instant1: " + instant1);

        Instant instant2 = Instant.now(Clock.systemUTC());
        System.out.println("Instant2: " + instant2);
        
        long now = System.currentTimeMillis();
        Instant instant3 = Instant.ofEpochMilli(now);
        System.out.println("Instant3: " + instant3);
        
        now = now/1000;
        Instant instant4 = Instant.ofEpochSecond(now);
        System.out.println("Instant4: " + instant4);
        
        Instant instant5 = Instant.ofEpochSecond(now, 345000000);
        System.out.println("Instant5: " + instant5);
        
        Instant instant6 = Instant.parse("1980-04-09T10:15:30.00Z");
        System.out.println("Instant6: " + instant6);
    }
}
