/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concepts.Iterator;

import java.util.*;


/**
 *
 * @author Chetan.Pachpande
 */
public class IteratorDemo {
    
    // SHORTCUT- use psvm and tab + tab to add main method
    // SHORTCUT - use sop to add System.Out.Println()
    public static void main(String[] args) {
            
        System.out.println("Iterator Demo");   
        System.out.println("-----------------");   
        
        // Create an array list
        ArrayList al = new ArrayList();
        
        // Add data in arraylist
        al.add("Chetan");
        al.add("Shalmal");
        al.add("Shrikant");
        al.add("Abhishek");
        al.add("Amrit");
        
        // Use iterator to display content of al
        System.out.print("Original Contents of al: ");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Object element = itr.next();            
            System.out.print(element + " ");         
            
        }
        
        System.out.println();
        
        
        
        
        
        
        
        
    }
    
}
