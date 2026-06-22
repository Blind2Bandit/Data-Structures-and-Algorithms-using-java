import java.util.*;
// use set to find the duplicate element while traversing the matrix
// other thing that we can do is calculate the sum while we are traversing 
// calculate the exprected sum as n (n+1)/2 and subtract the sum till now to get the missing number



class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[] = new int[2];
        int n = grid.length;
        int sum =0;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    sum+=grid[i][j];
                }else{
                    res[0] = grid[i][j];
                }
            }
        }
        // for(int i=1;i<=n*n;i++){
        //     if (!set.contains(i)){
        //         res[1]=i;
        //     }
        // }
        int expected_sum = (n*n * ((n*n)+1))/2 ;
        res[1] = expected_sum - sum;
        return res;
    }
}