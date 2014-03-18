/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Chetan
 */
public class ArraysMain {
 
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
        // Test Binary Search
        int a[] ={3,5,6,8,9,12,16};
        int result = ArraysPrograms.binarySearch(a, 6, 0, a.length-1);
        System.out.println("Result of Binary Search: " + result);   
        
        // Test isSumOfSubset
        int set[] = {3, 34, 4, 12, 5, 2};
        boolean sumSetResult = ArraysPrograms.isSumOfSubset(set, set.length, 38);
        System.out.println("Result of Sum of Subset: " + sumSetResult);
        
        // Test sumOfSubset
        System.out.println("Subsets with given sum: ");
        ArraysPrograms.sumOfSubset();
        
        
    }
}
