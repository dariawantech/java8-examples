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

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class GregorianCalendarChangeExample {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    static void checkLeapYear(GregorianCalendar cal) {        
        // get Gregorian change and print it
        System.out.println("Gregorian Change  : " + sdf.format(cal.getGregorianChange()));
        System.out.println("2100 is Leap Year?: " + cal.isLeapYear(2100));
        System.out.println("2020 is Leap Year?: " + cal.isLeapYear(2020));
        System.out.println("2000 is Leap Year?: " + cal.isLeapYear(2000));
        System.out.println("1700 is Leap Year?: " + cal.isLeapYear(1700));
        System.out.println("1600 is Leap Year?: " + cal.isLeapYear(1600));
        System.out.println("1584 is Leap Year?: " + cal.isLeapYear(1584));
        System.out.println("1580 is Leap Year?: " + cal.isLeapYear(1580));
        System.out.println("1300 is Leap Year?: " + cal.isLeapYear(1300));
        System.out.println("1200 is Leap Year?: " + cal.isLeapYear(1200));
        System.out.println("1160 is Leap Year?: " + cal.isLeapYear(1160));
        System.out.println();
    }
    
    public static void main(String[] args) {
        // create a new GregorianCalendar
        GregorianCalendar cal1 = new GregorianCalendar();

        // print the current date and time
        System.out.println("Calendar Date     : " + sdf.format(cal1.getTime()));
        System.out.println();
        
        checkLeapYear(cal1);
        
        // create another GregorianCalendar
        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.set(1199, 11, 31);
        cal2.setGregorianChange(cal2.getTime());
        checkLeapYear(cal2);
    }
}
