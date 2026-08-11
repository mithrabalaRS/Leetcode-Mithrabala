// Last updated: 8/11/2026, 2:20:43 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String doubled = s + s;
        return doubled.contains(goal);
    }
}