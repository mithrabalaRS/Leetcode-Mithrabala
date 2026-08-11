// Last updated: 8/11/2026, 2:16:21 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=0;
        while(n>0){
            int d=n%10;
            digitSum+=d;
            squareSum+=d*d;
            n/=10;
        }
        return(squareSum-digitSum)>=50;
    }
}