// <editor-fold defaultstate="collapsed" desc="Your Fold Comment">
// </editor-fold>
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
    
    // <editor-fold defaultstate="collapsed" desc="1. isAnagram Method">
    
    /**
     * PROGRAM TO CHECK IF TWO STRINGS ARE ANAGRAMS
     * @param s1
     * @param s2 
     */
    public static void isAnagram(String s1, String s2)
    {       
        int hit[] = new int[256];        
        int i = 0;
        
        if (s1.length() != s2.length())
        {
            System.out.println("Lenghts are not same, Not Anagram of each other...");
        }
        else
        {
            for (i = 0; i < s1.length() && i < s2.length(); i++)
            {
                hit[s1.charAt(i)]++;
                //System.out.println("s1.charAt(i) : " +s1.charAt(i)+ " hit[s1.charAt(i)] : " + hit[s1.charAt(i)] );
                hit[s2.charAt(i)]--;
                //System.out.println("s2.charAt(i) : " +s2.charAt(i)+ " hit[s2.charAt(i)] : " + hit[s2.charAt(i)] );
            } 
            
            boolean flag = false;
            
            for (int j = 0; j < s1.length(); j++) 
            {
                if(hit[s1.charAt(j)] != 0)
                {
                    flag = false;
                    break;
                }
                else
                {
                    //System.out.println("j : " + j );
                    //System.out.println("s1.charAt(j) : " +s1.charAt(j)+ " hit[s1.charAt(j)] : " + hit[s1.charAt(j)] ); 
                    flag = true;
                    continue;
                }                
            }            
            if (flag) {
                    System.out.println("Strings are Anagram of each other...");
                }
            else
            {
               System.out.println("Strings are not Anagram of each other..."); 
            }
        }     
     }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="2. Replace Space by %20 Method">
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
    // </editor-fold>
    
    
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
    
    // <editor-fold defaultstate="collapsed" desc="Method to print count of consecutive characters">
    /**
     * PROGRAM TO COUNT CHARACTERS IN STRING
     */
    public static void printCountOfChar()
    {
        String strCount = "aaaaabbbbcccc";
        System.out.println("Input String : " + strCount);
        
        char countChar[] = strCount.toCharArray();
        int count = 1;
        for (int i = 1; i < strCount.length(); i++) 
        {            
            if (countChar[i] == countChar[i - 1]) 
            {
                count++;
            } 
            else 
            {
                System.out.print("Character - ");
                System.out.print(countChar[i - 1] + " :");
                System.out.print(count);
                System.out.println();
                count = 1;
            }

        }
        System.out.print("Character - ");
        System.out.print(countChar[strCount.length() - 1] + " :");
        System.out.print(count);
        System.out.println();
    }
    // </editor-fold>
    
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
    public static boolean isUniqueWithoutArray(String str) 
    { 
        
        return true;
    
    }
    
    /**
     * 
     * @param str
     * @return 
     */
    public static boolean isUnique(String str)
    {
        boolean[] char_set = new boolean[256];
        
        for (int i = 0; i < str.length(); i++) {
            
            if(char_set[str.charAt(i)] == false)
            {
                char_set[str.charAt(i)] = true;
            }
            else
            {
                return false;
            }            
        }
        return true;
    }
    
}
