/**
 * Code Examples in JDK 8 v1 (https://www.dariawan.com)
 * Copyright (C) ${year} Dariawan <hello@dariawan.com>
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

import java.util.concurrent.TimeUnit;
import org.joda.time.Duration;
import org.joda.time.Instant;

public class ElapsedTimeJodaInstantDuration {

     static void doSomething() {
         try {
             // Sleep 3 seconds
             TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException ex) {
             System.out.println("InterruptedException occured: " + ex.getMessage());
         }
    }

    public static void main(String[] args) {
        Instant instantStart = Instant.now();
        long startTime = instantStart.getMillis();
        
        doSomething();
        
        Instant instantEnd = Instant.now();
        long endTime = instantEnd.getMillis();

        // calculate time difference
        long timeDiff = endTime - startTime;
        System.out.println("getMillis - Elapsed time in ms: " + timeDiff);
        
        long timeElapsed = new Duration(instantStart, instantEnd).getMillis();
        System.out.println("Duration - Elapsed time in ms: " + timeElapsed);
    }
}
