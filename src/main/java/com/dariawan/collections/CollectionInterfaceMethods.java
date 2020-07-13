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
package com.dariawan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CollectionInterfaceMethods {

    public static void main(String[] args) {

        Collection list = new LinkedList();
        list.add("red");
        list.add("green");
        list.add("blue");
        System.out.println("List                : " + list);
        System.out.println("List contains green?: " + list.contains("green"));

        Collection set = new TreeSet();
        set.add("red");
        set.add("green");
        System.out.println("Set                 : " + set);
        System.out.println("List contains set?  : " + list.containsAll(set));

        set.add("black");
        System.out.println("Set                 : " + set);
        System.out.println("List contains set?  : " + list.containsAll(set));

        System.out.println(">>> >>> >>>");

        Collection al = new ArrayList();
        System.out.println("ArrayList size      : " + al.size() + ", isEmpty?: " + al.isEmpty());
        al.addAll(list);
        System.out.println("Add to ArrayList    : " + list);
        System.out.println("ArrayList size (now): " + al.size() + ", isEmpty?: " + al.isEmpty());

        System.out.println(">>> >>> >>>");

        Collection pq = new PriorityQueue();
        pq.addAll(al);

        System.out.println("Loop PriorityQueue:");
        for (Object obj : pq) {
            System.out.println(obj);
        }

        System.out.println("Iterate PriorityQueue using Iterator:");
        System.out.println("Using while >>>");
        Iterator it1 = pq.iterator();
        // while
        while (it1.hasNext()) {
           System.out.println(it1.next());
        }

        System.out.println("Using for loop >>>");
        // for loop
        for (Iterator it2 = pq.iterator(); it2.hasNext();) {
            System.out.println(it2.next());
        }
    }
}
