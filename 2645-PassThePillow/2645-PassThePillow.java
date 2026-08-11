// Last updated: 8/11/2026, 2:17:17 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int a=time%(n-1);
        return cycle%2==0?a+1:n-a;
    }
}