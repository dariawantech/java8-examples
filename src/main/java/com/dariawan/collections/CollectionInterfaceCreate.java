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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionInterfaceCreate {

    public static void main(String[] args) {

        Collection colAL = new ArrayList();
        System.out.println(colAL.getClass().getName());

        Collection colV = new Vector();
        System.out.println(colV.getClass().getName());

        Collection colS = new Stack();
        System.out.println(colS.getClass().getName());

        Collection colLL = new LinkedList();
        System.out.println(colLL.getClass().getName());

        Collection colPQ = new PriorityQueue();
        System.out.println(colPQ.getClass().getName());

        Collection colHS = new HashSet();
        System.out.println(colHS.getClass().getName());

        Collection colLHS = new LinkedHashSet();
        System.out.println(colLHS.getClass().getName());

        Collection colTS = new TreeSet();
        System.out.println(colTS.getClass().getName());

        System.out.println(">>> >>> >>>");

        Collection ll = new LinkedList();
        System.out.println("Class        : " + ll.getClass().getName());
        Class[] tis = ll.getClass().getInterfaces();
        for (Class ti : tis) {
            System.out.println("Interface    : " + ti.getTypeName());
        }
        System.out.println("is Collection: " + (ll instanceof Collection));
        
        System.out.println(">>> >>> >>>");
        
        colHS.add("uno");
        colHS.add("due");
        colHS.add("tre");
        System.out.println(colHS.getClass().getName() + " : " + colHS);
    }
}
