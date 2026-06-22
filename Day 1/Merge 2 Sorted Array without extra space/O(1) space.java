//rather than filling from the start which mandated a need for a temp array
// since they are sorted you can start iterating from the behind to make the two arrays sorted from that one point


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        //since storing it in nums1 if i remains then the work is already sorted
        
        while(j>=0){
            nums1[k--] = nums2[j--];
        }

    }
}