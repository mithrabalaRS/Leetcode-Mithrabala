// Last updated: 8/11/2026, 2:18:52 PM
class Solution {
    public int subtractProductAndSum(int n) {
    int sum=0;
    int pro=1;
    int d;
    while(n!=0){
        d=n%10;
        pro=pro*d;
        sum=sum+d;
        n=n/10;
    }
    return(pro-sum);

    }
}