//Since the majority element will always occupy the center stage when the array is sorted
//we just sort the element in nlogn time and then choose the middle element


import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return  nums[nums.length/2];
    }
}