// Last updated: 8/11/2026, 2:17:20 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0)
         n/=2;
        else if(n==1)
        n=0;
        else
        n=n;
        return n;
    }
}