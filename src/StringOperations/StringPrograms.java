/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOperations;

/**
 *
 * @author Chetan
 */
public class StringPrograms {
    
    /**
     * PROGRAM TO CHECK IF TWO STRINGS ARE ANAGRAMS
     * @param s1
     * @param s2 
     */
    public static void isAnagram(String s1, String s2)
    {
        System.out.println("in IsAnagram..");
    }
    
    /**
     * PROGRAM TO REPLACE SPACE BY %20
     * 
     */
    public static void replaceSpaceBy() {
    
         String str = "hello world ";
        char c[] = str.toCharArray();

        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == ' ') {
                spaceCount++;
            }
        }
        
        int newLength = c.length + spaceCount * 2;
        char newString[] = new char[newLength];
        
        for (int i = c.length - 1; i >= 0; i--) {
            
            if (c[i] == ' ') 
            {
                newString[newLength - 1] = '0';
                newString[newLength - 2] = '2';
                newString[newLength - 3] = '%';
                newLength -= 3;
            } 
            else {
                newString[newLength - 1] = c[i];
                newLength -= 1;
            }
        }
        
        System.out.print("Replaced string is :");
        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
        }
    }
    
    /**
     * PROGRAM TO PRINT POSTFIX FORM
     */
    public static void postfix()
    {
        
    }
    
    /**
     * PROGRAM TO CHECK IF STRING IS PALINDROME OR NOT
     * @return : true of success
     */
    public static boolean isPalindrome()
    {
        return true;
    }
    
    /**
     * PROGRAM TO COUNT CHARACTERS IN STRING
     */
    public static void printCountOfChar()
    {
    }
    
    /**
     * PROGRAM TO CONVERT STRING TO INTEGER : ATOI function
     */
    public static void convertStringToInt() 
    {
        
    }
    
    /**
     * PROGRAM TO REMOVE CHARACTER FROM STRING
     */
    public static void removeCharacters()
    {
      
    }
    
    /**
     * PROGRAS TO SWAP 
     * @param c
     * @param a
     * @param b 
     */
    public static void swap(char c[], int a, int b){}
    
    /**
     * 
     */
    public static void reversesString(){}
    
    /**
     * 
     * @param str 
     */
    public static void removeDuplicates(char[] str){}
    
    /**
     * 
     * @param str 
     */
    public static void removeDuplicatesEff(char[] str){}
    
    /**
     * 
     * @param str
     * @return 
     */
    public static boolean isUniqueWithoutArray(String str) { return true;}
    
    
}
