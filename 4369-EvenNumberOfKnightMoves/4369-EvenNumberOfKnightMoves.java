// Last updated: 8/11/2026, 2:15:54 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s=(start[0]+start[1])%2;
        int t=(target[0]+target[1])%2;
        return s==t;
    }
}