//in this question we operate on the binary form of the number for ecponenent calculation rather than the actual number which would give me TLE
// implement the fraction of the number for negative exponents

class Solution {
    public double myPow(double x, int num) {
        long bin = num;
        double res = 1;
        if(num<0){
            bin=-bin;
            x=1/x;
        }
        while(bin>0){
            if(bin%2==1){
                res *= x;
            }
            bin/=2;
            x*=x;
        }
        return res;
    }

}