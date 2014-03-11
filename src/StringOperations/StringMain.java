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
        boolean val;
        // ISANAGRAM TEST
        //StringPrograms.isAnagram("abcdw", "bacd");
        
        // PRINT COUNT OF CHARs
        StringPrograms.printCountOfChar();
        
        // ISUNIQUE TEST
        val = StringPrograms.isUnique("abcdefghijk");
        if (val) {
            System.out.println("All Characters are Unique!!");
        }            
        else {
            System.out.println("Characters are not Unique!!");
        }
        
        // STRING TO INTEGERT TEST
        StringPrograms.convertStringToInt(null);
        
        // PALINDROME TEST
        val = StringPrograms.isPalindrome("abbaabba");
        if (val) {
            System.out.println("Input String is palindrome!!");
        }            
        else {
            System.out.println("Input String is not palindrome!!");
        }
        
        //POSTFIX TEST
        StringPrograms.postfix("43*2+");
        
        //TEST SWAP        
        StringPrograms.swap(4, 5);
        
        //TEST REMOVE CHARACTER METHOD
        StringPrograms.removeCharacters();
    }
}
    

