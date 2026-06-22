// Moore's Voting Algorithm 
// works on the principle that if an element is in abundance then it won't matter for the elements
// the frequency of smaller elements gets chopped off until all that is there are the value of the majority element. 
class Solution {
    public int majorityElement(int[] nums) {
        int cnt =0;
        int n = nums.length;
        int el = 0;
        for(int i=0;i<n;i++){
            if ( cnt == 0 ){
                el = nums[i];
            }
            if( el == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return el;
    }
}