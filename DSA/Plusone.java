<aside>
💡 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

</aside>


  class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i =digits.length-1; i>=0;i--){
            if(digits[i] != 9){
                digits[i] =digits[i]+1;
                break;

            }
            else{
               digits[i] = 0;
            }
        }

    if(digits[0] == 0){
        int[] ans = new int[(digits.length) +1];
        ans[0] = 1;
        return ans;

    }

return digits;
    }
}
