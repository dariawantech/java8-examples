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

public class CollectionInterfaceAddRemove {

    private void addToCollection(Collection collection) {
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println(collection.getClass().getName() + " : " + collection);
    }

    private void addAllToCollection(Collection collection) {
        Collection list = new ArrayList();
        list.add("uno");
        list.add("due");
        list.add("tre");

        collection.addAll(list);
        System.out.println(collection.getClass().getName() + " : " + collection);
    }
    
    private void removeFromCollection(Collection collection) {
        collection.remove("two");
        System.out.println(collection.getClass().getName() + " : " + collection);
    }
    
    private void removeAllFromCollection(Collection collection) {
        Collection set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        collection.removeAll(set);
        System.out.println(collection.getClass().getName() + " : " + collection);
    }
    
     private void retainAllFromCollection(Collection collection) {
        Collection anotherCol = new PriorityQueue();
        anotherCol.add("uno");
        anotherCol.add("tre");
        anotherCol.add("cinque");

        collection.retainAll(anotherCol);
        System.out.println(collection.getClass().getName() + " : " + collection);
    }
    

    public static void main(String[] args) {

        CollectionInterfaceAddRemove app = new CollectionInterfaceAddRemove();

        Collection colAL = new ArrayList();
        app.addToCollection(colAL);

        Collection colV = new Vector();
        app.addToCollection(colV);

        Collection colS = new Stack();
        app.addToCollection(colS);

        Collection colLL = new LinkedList();
        app.addToCollection(colLL);

        Collection colPQ = new PriorityQueue();
        app.addToCollection(colPQ);

        Collection colHS = new HashSet();
        app.addToCollection(colHS);

        Collection colLHS = new LinkedHashSet();
        app.addToCollection(colLHS);

        Collection colTS = new TreeSet();
        app.addToCollection(colTS);
        
        System.out.println(">>> >>> >>>");
        
        app.removeFromCollection(colAL);
        app.removeFromCollection(colV);
        app.removeFromCollection(colS);
        app.removeFromCollection(colLL);
        app.removeFromCollection(colPQ);
        app.removeFromCollection(colHS);
        app.removeFromCollection(colLHS);
        app.removeFromCollection(colTS);
        
        System.out.println(">>> >>> >>>");
        
        app.addAllToCollection(colAL);
        app.addAllToCollection(colV);
        app.addAllToCollection(colS);
        app.addAllToCollection(colLL);
        app.addAllToCollection(colPQ);
        app.addAllToCollection(colHS);
        app.addAllToCollection(colLHS);
        app.addAllToCollection(colTS);
        
        System.out.println(">>> >>> >>>");
        
        app.removeAllFromCollection(colAL);
        app.removeAllFromCollection(colV);
        app.removeAllFromCollection(colS);
        app.removeAllFromCollection(colLL);
        app.removeAllFromCollection(colPQ);
        app.removeAllFromCollection(colHS);
        app.removeAllFromCollection(colLHS);
        app.removeAllFromCollection(colTS);
        
        System.out.println(">>> >>> >>>");
        
        app.retainAllFromCollection(colAL);
        app.retainAllFromCollection(colV);
        app.retainAllFromCollection(colS);
        app.retainAllFromCollection(colLL);
        app.retainAllFromCollection(colPQ);
        app.retainAllFromCollection(colHS);
        app.retainAllFromCollection(colLHS);
        app.retainAllFromCollection(colTS);
    }
}
