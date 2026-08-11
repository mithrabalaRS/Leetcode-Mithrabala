// Last updated: 8/11/2026, 2:17:40 PM
class Solution {
    public boolean isThree(int n) {
        int c=0;
        int i;
        for(i=1;i<=n;i++){
            if(n%i==0)
            c++;
        }
        if(c==3)
        return true;
        else
        return false;
        }
    }

