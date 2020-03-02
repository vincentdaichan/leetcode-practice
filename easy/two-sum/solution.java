/* v1.0 */

class Solution {
    public int[] twoSum(int[] nums, int target) { // Given [2, 7, 11, 15], target = 9 Return the indices of two num that add up to target 
        
        // 1. Brute Force: Iterate through list adding each num to n + 1 times 
        
        int index1 = 0;
        int  index2 = 1;
        
        int[] result = {0, 0};
        
        for(int i = index1; i < nums.length; i++) {
            
            for (int n = index2; n < nums.length; n++) {
                System.out.println(n);
                if (nums[i] + nums[n] == target)  {
                    index1 = i;
                    index2 = n;
                    break;
                    
                }
                
            } // End Inner loop
           
        } // End Outer loop
        
        result[0] = index1;
        result[1] = index2;
        return result;
    }
}