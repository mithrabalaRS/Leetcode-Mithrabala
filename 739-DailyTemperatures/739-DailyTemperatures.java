// Last updated: 8/11/2026, 2:21:19 PM
class Solution {
    public int[] dailyTemperatures(int[]t) {
        Stack<Integer> a = new Stack<>();
        int[] r= new int[t.length];
        for(int i=0;i<t.length;i++){
            while(! a.isEmpty() && t[a.peek()]<t[i]){
                int prev=a.pop();
                r[prev]=i-prev;
            }
            a.push(i);
        }
        return r;
    }
}