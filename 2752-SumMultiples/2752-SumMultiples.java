// Last updated: 8/11/2026, 2:17:04 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        int i;
       for(i=1;i<=n;i++) {
       if(i%3==0||i%5==0||i%7==0){
       sum=sum+i;}
       }
       return sum;
    }
    
}