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
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class IteratorInterfaceModificationExample02 {

    public void testCollection(Class<?> cls) {
        
        System.out.println(" >>> >>> >>> >>> >>>");
        Collection<Integer> col = null;

        if (cls == ArrayList.class) {
            col = new ArrayList<>();
        }
        else if (cls == Vector.class) {
            col = new Vector<>();
        }
        else if (cls == Stack.class) {
            col = new Stack<>();
        } 
        else if (cls == Stack.class) {
            col = new Stack<>();
        } 
        else if (cls == LinkedList.class) {
            col = new LinkedList<>();
        }
        else if (cls == PriorityQueue.class) {
            col = new PriorityQueue<>();
        }
        else if (cls == HashSet.class) {
            col = new HashSet<>();
        }
        else if (cls == LinkedHashSet.class) {
            col = new LinkedHashSet<>();
        }
        else if (cls == TreeSet.class) {
            col = new TreeSet<>();
        }
        
        col.add(100);
        col.add(200);
        col.add(300);
        System.out.println(cls.getSimpleName() + ": " + col);
        
        Iterator<Integer> iterator = col.iterator();        

        try {
            while(iterator.hasNext()) {
                iterator.next();
                col.add(400);                           
            }
        }
        catch (ConcurrentModificationException cme) {
            System.out.println("ConcurrentModificationException occured when adding");
        }
        
        iterator = col.iterator();        

        try {
            while(iterator.hasNext()) {
                iterator.next();
                col.remove(100);                           
            }
        }
        catch (ConcurrentModificationException cme) {
            System.out.println("ConcurrentModificationException occured when remove");
        }
        System.out.println(cls.getSimpleName() + " now: " + col);
    }
    
    public static void main(String[] args) {
        IteratorInterfaceModificationExample02 program = new IteratorInterfaceModificationExample02();
        program.testCollection(ArrayList.class);
        program.testCollection(Vector.class);
        program.testCollection(Stack.class);
        program.testCollection(LinkedList.class);
        program.testCollection(PriorityQueue.class);
        program.testCollection(HashSet.class);
        program.testCollection(LinkedHashSet.class);
        program.testCollection(TreeSet.class);
    }
}
