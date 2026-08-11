// Last updated: 8/11/2026, 2:16:03 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxR=-1;
        int sum=0;
        for(int num:nums){
            int temp=num;
            int largest=0;
            int smallest=9;
            while(temp>0){
                int digit=temp%10;
                if(digit>largest)
                    largest=digit;
                if(digit<smallest)
                    smallest=digit;
                temp/=10;
            }
            int range=largest-smallest;
            if(range>maxR){
                maxR=range;
                sum=num;
            }else if(range==maxR){
                sum+=num;
            }
        }
        return sum;
    }
        }

