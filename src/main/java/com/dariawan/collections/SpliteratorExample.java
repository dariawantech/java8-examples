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
package com.dariawan.collections;

import java.util.Collection;
import java.util.Spliterator;
import java.util.Stack;

public class SpliteratorExample {

    public static void main(String[] args) {
        Collection coll = new Stack();

        coll.add("China");
        coll.add("Japan");
        coll.add("Korea");
        coll.add("Mongolia");
        coll.add("Vietnam");
        coll.add("Laos");
        coll.add("Cambodia");
        
        // Getting Spliterator object on collection.
        Spliterator<String> splitList = coll.spliterator();
        
        // Checking sizes:
        System.out.println("Estimate size: " + splitList.estimateSize());
        System.out.println("Exact size: " + splitList.getExactSizeIfKnown());

        System.out.println("\nContent of List:");
        // using forEachRemaining() method
        splitList.forEachRemaining((n) -> System.out.println(n));

        // Obtaining another Stream to the mutant List.
        Spliterator<String> splitList1 = coll.spliterator();
        System.out.println("\nSplitList1 estimate size: " + splitList1.estimateSize());

        // Splitting it using trySplit() method
        Spliterator<String> splitList2 = splitList1.trySplit();
        System.out.println("\nAfter split >>>");
        System.out.println("SplitList1 estimate size (now): " + splitList1.estimateSize());

        // Use splitList2 first.
        if (splitList2 != null) {
            System.out.println("SplitList2 estimate size: " + splitList2.estimateSize());
            System.out.println("\nOutput from splitList2:");
            splitList2.forEachRemaining((n) -> System.out.println(n));
        }

        // Now, use the splitList1
        System.out.println("\nOutput from splitList1:");
        splitList1.forEachRemaining((n) -> System.out.println(n));
    }
}