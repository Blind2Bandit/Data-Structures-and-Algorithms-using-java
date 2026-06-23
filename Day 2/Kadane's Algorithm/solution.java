// the idea of Kadane's algorithm is to calculate the maximum subarray sum in O(n) time 
// traverse and if the sum < 0 reset it to 0.

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(sum, maxsum);
            if(sum<0) sum = 0;

            // we do this last so that if in case no elements are positive, we store a maxsum atleast once. 
        }
        return maxsum;
    }
}