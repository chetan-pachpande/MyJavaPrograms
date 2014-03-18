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
    
    int iData;
    double dData;
    Link next;

        
    //---------------------------------------
    
    public Link(int iD, double dD)
    {
        iData = iD;
        dData = dD; 
        next = null;
    }
           
    //--------------------------------------
    
    public void displayLink()
    {
        System.out.println("{ " + iData + " ," + dData + "}");
    }
    
}
