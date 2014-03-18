/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Chetan
 */
public class ArraysPrograms {
 
    // <editor-fold defaultstate="collapsed" desc="1. Binaray Search Implementation">
    /**
     * 
     * @param a
     * @param key
     * @param start
     * @param end
     * @return 
     */
    public static int binarySearch(int a[], int key, int start, int end) 
    {
        System.out.println("In Binary Search...");  
        
        //Step 1: if key is start element 
        if (a[start] == key) 
        {
            return start;
        }
        //Step 2: Calculate mid
        int mid = (start + end) /2;
        //Step 3: if Start reaches End
        if(start == end)
        {
            return -1;
        }
        
        //Step 4: if key is mid element
        if(a[mid] == key)
        {
            return mid;
        }
        //Step 5: if key is less that mid
        else if(key < a[mid])
        {
            return binarySearch(a,key,start,mid-1);
        }
        //Step 6: if key is greater that mid
        else
        {
            return binarySearch(a,key,mid+1,end);
        }
               
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="2. Method to check if subset for given sum present or not">
    /**
     * Method to find in subset for given sum is present or not
     * http://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
     * TODO: Implement using dynamic programming
     */
    public static boolean isSumOfSubset(int set[], int n, int sum)
    {
        //Step 1: if sum is 0 then return true
        if (sum == 0) 
        {
            return true;            
        }
        //Step 2: if number of elements becomes 0 and sum is non zero return false
        if(n == 0 && sum!=0)
        {
            return false;
        }
        //Step 3: if last element is greater than sum ignore it
        if(set[n-1] > sum)
        {
            return isSumOfSubset(set,n-1,sum);
        }
        
        /* Step4: 
           else, check if sum can be obtained by any of the following
           (a) including the last element
           (b) excluding the last element  
        */
        return isSumOfSubset(set, n-1, sum) || isSumOfSubset(set, n-1, sum-set[n-1]);
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="3. Method to find subsets with given sum">
    /**
     * Method To find subsets which equals up with given sum
     * require sorted array
     */
    public static void sumOfSubset() {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        int j = a.length - 1;
        int sum = 9;
        while (i < j) {
            if (a[i] + a[j] == sum) {
                System.out.print(a[i] + " " + a[j]);
                System.out.println();
                i++;
                j--;
            } else if (a[i] + a[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
    }
    // </editor-fold>
    
    /**
     * 
     */
    public static void maxDifference(){}
    
    /**
     * 
     */
    public static void zeroOnLeft(){}
    
    /**
     * 
     * @param nums
     * @param start
     * @param end
     * @param k
     * @return 
     */
    public static int findKthLargestEmlement(int nums[], int start, int end, int k) { return 0;}
    
    /**
     * 
     * @param arr
     * @param a
     * @param b 
     */
    public static void swap(int arr[], int a, int b){}
    
    /**
     * 
     */
    public static void occuringInBoth(){}
    
    /**
     * 
     * @return 
     */
    public static boolean isPalindrome(){return true;}
    
    /**
     * 
     */
    public static void mostOccuring() {}
    
    /**
     * 
     * @param a 
     */
    public static void display(int a[]){}
    
    /**
     * 
     */
    public interface Person {
        public void foo();
    }
}
