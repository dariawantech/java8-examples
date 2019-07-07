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

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UtilDateInitExample {
    
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("date1: " + date1);
        System.out.println("date1.getTime(): " + date1.getTime());

        long now = System.currentTimeMillis();
        Date date2 = new Date(now);
        System.out.println("currentTimeMillis: " + now);
        System.out.println("date2: " + date2);
        System.out.println("date2.getTime(): " + date2.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
	String strDate = "06-07-2019 04:07 PM";
	try {
            Date date = sdf.parse(strDate);
            System.out.println(date);
        } catch (ParseException ex) {
            System.out.println("ParseException occured: " + ex.getMessage());
        }
    }
}
