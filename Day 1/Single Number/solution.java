// so use the bitwise Xor operation for cancelling out the duplicates 
// what remains is the solo element

class Solution {
    public int singleNumber(int[] nums) {
        int xorr = 0;
        for(int num:nums){
            xorr^=num;
        }
        return xorr;
    }
}