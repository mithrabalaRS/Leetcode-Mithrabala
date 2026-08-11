// Last updated: 8/11/2026, 2:16:53 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        
        int count=0;
        int i=0;
        while(mainTank!=0){
             count++;
             if(count==5){
                if(additionalTank!=0){
               additionalTank=additionalTank-1;
               mainTank=mainTank+1;
               count=0;
                }
               
             }
        mainTank=mainTank-1; 
        i++;
    }
return i*10;
}
}