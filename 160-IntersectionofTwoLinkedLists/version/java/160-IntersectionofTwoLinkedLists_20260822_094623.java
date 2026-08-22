// Last updated: 8/22/2026, 9:46:23 AM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3
4        ListNode pA = headA;
5        ListNode pB = headB;
6
7        while (pA != pB) {
8
9            if (pA == null) {
10                pA = headB;
11            } else {
12                pA = pA.next;
13            }
14
15            if (pB == null) {
16                pB = headA;
17            } else {
18                pB = pB.next;
19            }
20        }
21
22        return pA;
23    }
24}