// <editor-fold defaultstate="collapsed" desc="Your Fold Comment">
// </editor-fold>
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOperations;

import java.util.Stack;

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

    // <editor-fold defaultstate="collapsed" desc="3. Method to process Postfix expression">
    /**
     * PROGRAM TO PRINT POSTFIX FORM
     */
    public static void postfix(String postfixInput)
    {
        int result = 0;
        int val = 0;
        int var1 = 0;
        int var2 = 0;
        char ch = ' ';
        
        Stack s = new Stack();
        
        for (int i = 0; i < postfixInput.length(); i++) {
            ch = postfixInput.charAt(i);
            val = ch - '0';
            
            if(val >=0 && val <9)
            {
                s.push(val);
            }
            else
            {
                var1 = (int)s.pop();
                var2 = (int)s.pop();
                
                switch(ch)
                {
                    case '+':
                        result = var1 + var2;
                        break;
                    case '-':
                        result = var1 - var2;
                        break;
                    case '/':
                        result = var1 / var2;
                        break;
                    case '*':
                        result = var1 * var2;
                        break;
                    default:
                        result = 0;
                        System.out.println("Invalid characterr encountered!!");
                        break;
                }
                s.push(result);
            }
        }
        result = (int)s.pop();
        System.out.println("The result of postfix " + postfixInput + " is: " + result);
            
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="4. Method to check if string is Palindrome or not">
    /**
     * PROGRAM TO CHECK IF STRING IS PALINDROME OR NOT
     * @return : true of success
     */
    public static boolean isPalindrome(String inputString)
    {
        char[] inputCharArray = inputString.toCharArray();
        
        int start,end;
        boolean result = false;
        start = 0;
        end = inputString.length() - 1;
        
        while(start <= end)
        {
            // Perform Action
            if (inputCharArray[start] == inputCharArray[end]) {
                result = true;
            }
            else
            {
                break;
            }
            start++;
            end--;
        }
        
        if (result) {
            return true;    
        }
        return false;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="5. Method to print count of consecutive characters">
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
    
    // <editor-fold defaultstate="collapsed" desc="6. Method to Convert String to integer (AtoI)">
    /**
     * PROGRAM TO CONVERT STRING TO INTEGER : ATOI function
     */
    public static void convertStringToInt(String inputString) 
    {
        inputString = "-90";
        
        if(inputString == null || inputString.length() == 0)
        {
            System.out.println("String is empty...");
        }
        
        int result = 0;
        int value = 0;
        int negative = 0;
        
        if(inputString.charAt(0) == '-')
        {
            negative = 1;
        }
        
        for (int i = 0; i < inputString.length(); i++) 
        {
            if(negative == 1 && i == 0)
            {
                continue;
            }
            else
            {
                value = inputString.charAt(i) - '0';
                if (value < 0 || value > 9) 
                {
                    System.out.println("Invalid number!!!");
                    break;
                }
            }
            
            result = result*10 + value; 
        }
        
        if (negative == 1) {
            result = result * -1;
        }
        
        System.out.println("The converted string is: " + result);
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="7. Method to Remove Characters from String">    
    /**
     * PROGRAM TO REMOVE CHARACTER FROM STRING
     */
    public static void removeCharacters()
    {
      String str2 = "Amazon Development";
        String str1 = "aze";
        StringBuilder sb = new StringBuilder(str2);        
        int count = 0;
        boolean hit[] = new boolean[256];
        
        for (int i = 0; i < str1.length(); i++) {
            hit[str1.charAt(i)] = true;
        }

        for (int j = 0; j < str2.length(); j++) {
            if (hit[str2.charAt(j)]) {                
                sb.deleteCharAt(j-count);               
                count++;
            } 
        }        
        str2 = sb.toString();
        System.out.println("String: " + str2);
        System.out.println("No of characters replaced are :" + count);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="8. Method to Swap two integers">  
    /**
     * PROGRAS TO SWAP 
     * @param c
     * @param a
     * @param b 
     */
    public static void swap(int a, int b)
    {
        System.out.println("Before Swapping, a: " + a + " b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping, a: " + a + " b: " + b);
    }
    // </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="9. Method to Swap chars">
    /**
     * 
     * @param c
     * @param a
     * @param b 
     */
    public static void swap(char c[], int a, int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
    // </editor-fold>  
   
    // <editor-fold defaultstate="collapsed" desc="10. Method To reverse a string ">
    //http://wiki.netbeans.org/SurroundWithCodeFolding
    /**
     *
     * @param inputString
     */
    public static void reversesString(String inputString) {
        char[] reverseStr = new char[inputString.length()];
        
        reverseStr = inputString.toCharArray();
        
        for (int i = 0; i < inputString.length() / 2; i++) {            
            swap(reverseStr, i, (inputString.length() - 1) - i);
        }
        
        System.out.print("Reversed String after first loop: ");
        System.out.print(reverseStr);
        System.out.println();
        
        int prev = 0;
        int temp = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (reverseStr[i] == ' ') {
                if (i == 0) {
                    temp = 0;
                } else {
                    temp = i - 1;
                }
                
                while (prev < temp) {
                    swap(reverseStr, prev, temp);
                    prev++;
                    temp--;                    
                }
                prev = i + 1;
            }
        }
        
        temp = reverseStr.length - 1;
        
        while (prev < temp) {
            swap(reverseStr, prev, temp);
            prev++;
            temp--;            
        }

        // After full reversal
        System.out.print("Reversed String after second loop: ");
        System.out.print(reverseStr);
        System.out.println();
    }

// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="11. Method to remove duplicates from character array ">
    /**
     * Method to Remove duplicates
     *
     * @param str
     */
    public static void removeDuplicates(char[] str) {
        if (str == null) {
            return;
        }
        int length = str.length;
        if (length < 2) {
            return;
        }
        
        int tail = 1;

        //outer loop
        for (int i = 0; i < str.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
            
        }
        
        str[tail] = 0;
        String result = String.valueOf(str);
        System.out.println("Updated string is: " + result);
    }

// </editor-fold>
  
    // <editor-fold defaultstate="collapsed" desc="12. Method to remove duplicates from character array - Efficient">   

    /**
     * Efficient Method to remove duplicates from character array
     * @param str 
     */
    public static void removeDuplicatesEff(char[] str)
    {

        //Step 1:
        if (str == null) {
            return;
        }
        //Step 2:
        if(str.length < 2 )
        {
            return;
        }
        //Step 3:
        boolean[] hit = new boolean[256];
        //Step 4:
        for (int i = 0; i < hit.length; i++) {
            hit[i] = false;
        }
        //Step 5:
        hit[str[0]] = true;
        //Step 6:
        int tail = 1;
        for (int i = 0; i < str.length; i++) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            }
        }
        
        //Step 7:
        str[tail] = 0;
        
        String result = String.valueOf(str);
        System.out.println("Updated string is: " + result);
    }
    // </editor-fold>
          
    // <editor-fold defaultstate="collapsed" desc="13. IsUnique Function (without using addtional storage)">
    /**
     * 
     * @param str
     * @return 
     */
    public static boolean isUniqueWithoutArray(String str) 
    { 
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);

        }
        return true;       
    }
     // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="14. IsUnique Function">
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
    // </editor-fold>
}
