/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author Chetan
 */
public class Link {
    
    // DATA MEMBERS
    int iData;
    double dData;
    Link next;
        
    //---------------------------------------
    // CONSTRUCTOR
    public Link(int iD, double dD)
    {
        iData = iD;
        dData = dD; 
        next = null;
    }
           
    //--------------------------------------
    // DISPLAY LINK
    public void displayLink()
    {
        System.out.println("{ " + iData + " ," + dData + "}");
    }
    
}
