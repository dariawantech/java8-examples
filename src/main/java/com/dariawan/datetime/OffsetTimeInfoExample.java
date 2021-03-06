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

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeInfoExample {
    
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        System.out.println("OffsetTime      : " + offsetTime);
        System.out.println("Hour            : " + offsetTime.getHour());
        System.out.println("Minute          : " + offsetTime.getMinute());
        System.out.println("Second          : " + offsetTime.getSecond());
        System.out.println("Nano            : " + offsetTime.getNano());
        
        System.out.println("HOUR_OF_DAY     : " + offsetTime.get(ChronoField.HOUR_OF_DAY));        
        System.out.println("MINUTE_OF_HOUR  : " + offsetTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE: " + offsetTime.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("NANO_OF_SECOND  : " + offsetTime.get(ChronoField.NANO_OF_SECOND));
        
        System.out.println("MINUTE_OF_DAY   : " + offsetTime.getLong(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY   : " + offsetTime.getLong(ChronoField.SECOND_OF_DAY));
        System.out.println("NANO_OF_DAY     : " + offsetTime.getLong(ChronoField.NANO_OF_DAY));
        
        System.out.println("Offset          : " + offsetTime.getOffset());        
        System.out.println("toLocalTime()   : " + offsetTime.toLocalTime());
    }
}
