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
    
    // CONSTRUCTOR
    public void LinkList()
    {
        first = null;
    }
    
    // CHECK IF LIST IS EMPTY OR NOT
    public boolean isEmpty()
    {
        if (first == null) {
            return true;
        }
        else
            return false;
    }
    
    // INSERT FIRST ELEMENT
    public void insertFirst(int id, double dd)
    {
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }
    
    // DELETE FIRST ELEMENT
    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;        // Deleted element
    }
    
    // DISPLAY LIST
    public void displayList()
    {
        System.out.println("Display LinkLis {First -> Last}");
        
        Link current = first;  // Assign first to current, current will act as pointer to traverse
        
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}
