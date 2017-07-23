/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uia;

import java.util.ArrayList;

/**
 *
 * @author snorr
 */
public class UIA {
    /**
     * Fields.
     */
    private ArrayList<Person> list;
    
    /**
     * Constructor.
     */
       public UIA()
       {
           list = new ArrayList<>();
       }
       
       /**
        * Add a new person to the list.
        */
       public void (Person newPerson)
       {
           list.add(newPerson);
       }
       
       
}
