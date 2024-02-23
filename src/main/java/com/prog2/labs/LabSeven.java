package com.prog2.labs;

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
        // this is a test
    }

    /**
     * Please refer to the README file for question(s) description
     * @param nums
     * @param k
     * @return 
     */
    public static int kthSmallestSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        
        int[] sums = new int[n*((n+1)/2)];
        
        for(int i=0; i<n; i++){
         
            for(int j = i; j<n; j++){
                
                for(int y = 0; y<sums.length; y++){
                int sum = 0;
                
                    for(int z=i; z<=j; z++){
                    sum += nums[z];
                    
                    
                }sums[y]=sum;
                
                
                
                
            }
            
            }
            
            
        }
        
        
        return 0;
    }
}
