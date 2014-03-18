/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author Chetan
 */
public class LinkList {
    
    private Link first; //First Element of LinkList
    
    public void LinkList()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
        if (first == null) {
            return true;
        }
        else
            return false;
    }
    
    public void insertFirst(int id, double dd)
    {
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }
    
    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList()
    {
        System.out.println("Display LinkLis {First -> Last}");
        
        Link current = first;
        
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}
