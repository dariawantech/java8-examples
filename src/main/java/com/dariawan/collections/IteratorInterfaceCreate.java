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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IteratorInterfaceCreate {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator it1 = list.iterator();

        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        Set<String> set = new LinkedHashSet<>();
        set.add("apple");
        set.add("beet");
        set.add("carrot");

        for (Iterator it2 = set.iterator(); it2.hasNext();) {
            System.out.println(it2.next());
        }
        
        System.out.println(">>> >>> >>>");
        
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(50);
        linkedList.add(40);

        System.out.println("LinkedList: " + linkedList);
        Iterator iter1 = linkedList.iterator();
        while(iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(40);

        System.out.println("TreeSet: " + treeSet);
        Iterator iter2 = treeSet.iterator();
        while(iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        
        System.out.println(">>> >>> >>>");
        
        Collection<Integer> listInt = new ArrayList<>();
        listInt.add(101);
        listInt.add(102);
        listInt.add(103);
        System.out.println("ArrayList: " + listInt);

        Iterator<Integer> iterator = listInt.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.println("Something wrong happen, since iterator.hasNext() should be false");
        }
        
        System.out.println("Let's print again...");
        iterator = listInt.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("Current list: " + listInt);
        iterator = listInt.iterator();

        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("for each remaining:");
        iterator.forEachRemaining(i -> {
            System.out.println(i);
        });
    }
}
