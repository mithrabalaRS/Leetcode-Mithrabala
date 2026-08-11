// Last updated: 8/11/2026, 2:18:29 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = (numBottles-1)/(numExchange-1);
        return sum+numBottles;
    }
}