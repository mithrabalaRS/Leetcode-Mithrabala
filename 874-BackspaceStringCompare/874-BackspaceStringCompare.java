// Last updated: 8/11/2026, 2:20:29 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
     Stack<Character> s1 = new Stack<>();
     Stack<Character> t1 = new Stack<>();
     for(char c:s.toCharArray()){
        if(c!='#'){
            s1.push(c);
        }
        else if(!s1.isEmpty()){
            s1.pop();
        }
     }
     for(char c:t.toCharArray()){
        if(c!='#'){
            t1.push(c);
        }
        else if(!t1.isEmpty()){
            t1.pop();
        }
     }
     return s1.equals(t1);  
    }
}