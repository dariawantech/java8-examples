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

import com.dariawan.vo.SimpleVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class IteratorInterfaceModificationExample01 {

    public static void main(String[] args) {

        Collection<SimpleVO> list = new ArrayList<>();
        list.add(new SimpleVO(10, "10", "Number 10"));
        list.add(new SimpleVO(20, "20", "Number 20"));
        list.add(new SimpleVO(30, "30", "Number 30"));
        System.out.println("ArrayList: " + list);

        Iterator<SimpleVO> iterator = list.iterator();

        while (iterator.hasNext()) {
            SimpleVO vo = iterator.next();
            vo.setId(vo.getId() + 5);
        }
        System.out.println("ArrayList: " + list);

        iterator = list.iterator();

        try {
            while(iterator.hasNext()) {
                SimpleVO vo = iterator.next();
                list.add(new SimpleVO(vo.getId() + 100, "100", "Number 100"));
            }
        }
        catch (ConcurrentModificationException cme) {
            System.out.println("ConcurrentModificationException occured when adding");
        }        
        System.out.println("ArrayList: " + list);

        iterator = list.iterator();
        try {
            while(iterator.hasNext()) {
                SimpleVO vo = iterator.next();
                list.remove(vo);
            }
        }
        catch (ConcurrentModificationException cme) {
            System.out.println("ConcurrentModificationException occured when remove");
        }
        System.out.println("ArrayList: " + list);

        try {
            iterator.forEachRemaining(vo -> {
               System.out.println(vo);
           });
        }
        catch (ConcurrentModificationException cme) {
            System.out.println("ConcurrentModificationException occured when call forEachRemaining(...)");
        }        
        System.out.println("ArrayList: " + list);
        
        iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("Remove: " + iterator.next());
            iterator.remove();
        }
        System.out.println("ArrayList: " + list);
    }
}
