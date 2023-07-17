// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: 6
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 24

class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);

        int len  =nums.length-1;
        int lastsec =nums.length-2;
        int lastthird =nums.length-3;

        
    return Math.max((nums[len]*nums[lastsec]*nums[lastthird])
    ,(nums[len]*nums[0]*nums[1]));
     }
}
