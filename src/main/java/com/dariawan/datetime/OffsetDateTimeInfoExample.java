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

import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class OffsetDateTimeInfoExample {
    
    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println("OffsetDateTime   : " + offsetDT);
        System.out.println("DayOfMonth       : " + offsetDT.getDayOfMonth());
        System.out.println("MonthValue       : " + offsetDT.getMonthValue());
        System.out.println("Year             : " + offsetDT.getYear());
        
        System.out.println("Hour             : " + offsetDT.getHour());
        System.out.println("Minute           : " + offsetDT.getMinute());
        System.out.println("Second           : " + offsetDT.getSecond());
        System.out.println("Nano             : " + offsetDT.getNano());
        
        System.out.println("DayOfWeek        : " + offsetDT.getDayOfWeek());
        System.out.println("Month            : " + offsetDT.getMonth());
        System.out.println("DayOfYear        : " + offsetDT.getDayOfYear());

        System.out.println("DAY_OF_MONTH     : " + offsetDT.get(ChronoField.DAY_OF_MONTH));        
        System.out.println("MONTH_OF_YEAR    : " + offsetDT.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("YEAR             : " + offsetDT.get(ChronoField.YEAR));
        
        System.out.println("HOUR_OF_DAY      : " + offsetDT.get(ChronoField.HOUR_OF_DAY));        
        System.out.println("MINUTE_OF_HOUR   : " + offsetDT.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE : " + offsetDT.get(ChronoField.SECOND_OF_MINUTE));
        
        System.out.println("MINUTE_OF_DAY    : " + offsetDT.getLong(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY    : " + offsetDT.getLong(ChronoField.SECOND_OF_DAY));
        
        System.out.println("Offset           : " + offsetDT.getOffset()); 
        
        System.out.println("toEpochSecond()  : " + offsetDT.toEpochSecond());
        System.out.println("toInstant()      : " + offsetDT.toInstant());
        System.out.println("toLocalDate()    : " + offsetDT.toLocalDate());
        System.out.println("toLocalDateTime(): " + offsetDT.toLocalDateTime());
        System.out.println("toLocalTime()    : " + offsetDT.toLocalTime());
        System.out.println("toZonedDateTime(): " + offsetDT.toZonedDateTime());
    }
}
