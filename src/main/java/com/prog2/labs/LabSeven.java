package com.prog2.labs;

import java.util.Arrays;

/**
 * @author adinashby
 *
 */
public class LabSeven {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

int[] num={3,3,5,5};
int l=7;
         kthSmallestSubarraySum(num, l);

    }

    /**
     * Please refer to the README file for question(s) description
     * @param nums
     * @param k
     * @return 
     */
    public static int kthSmallestSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        SelectionSort<Integer> sortSelection= new SelectionSort();
        BinarySearch search= new BinarySearch();
        
        
        Integer[] sums = new Integer[n*(n+1)/2];
        int y=0;
        
        
        for(int i=0; i<n; i++){
            for(int j = i; j<n; j++){
                
                int sum = 0;
                    for(int z=i; z<=j; z++){
                    sum =sum+ nums[z];

                        
                }sums[y++]=sum;
          sortSelection.printArray(sums);

                    
            }
            }

                sortSelection.sort(sums); 
                
                
        int kSmallest = search.binarySearch(sums,k);
                
                
                
                             
        return kSmallest;
    }
}
