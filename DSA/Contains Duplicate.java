

<aside>
💡 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

</aside>

  class Solution {
    public boolean containsDuplicate(int[] nums) {
        

         HashSet<Integer> hsh = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {
            hsh.add(nums[i]);
        }
        int distinctsize = hsh.size();

        if(distinctsize != nums.length){
            return true;
        }

        return false;
    }
}
