/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOperations;

/**
 *
 * @author Chetan
 */
public class StringMain {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        runTest();
    }
    
    /**
     * TESST FUNCTION: Keeps main function clean
     */
    public static void runTest()
    {
        // ISANAGRAM TEST
        //StringPrograms.isAnagram("abcdw", "bacd");
        
        // PRINT COUNT OF CHARs
        StringPrograms.printCountOfChar();
        
        // ISUNIQUE TEST
        boolean val = StringPrograms.isUnique("abcdefghijk");
        if (val) {
            System.out.println("All Characters are Unique!!");            
        }
        else
        {
            System.out.println("Characters are not Unique!!");
        }
        
    }
}
    

