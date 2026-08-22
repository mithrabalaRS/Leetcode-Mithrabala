// Last updated: 8/22/2026, 9:47:49 AM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode groupPrev = dummy;
8
9        while (true) {
10
11            // Find kth node
12            ListNode kth = groupPrev;
13
14            for (int i = 0; i < k; i++) {
15                kth = kth.next;
16
17                if (kth == null) {
18                    return dummy.next;
19                }
20            }
21
22            ListNode groupNext = kth.next;
23
24            // Reverse group
25            ListNode prev = groupNext;
26            ListNode curr = groupPrev.next;
27
28            while (curr != groupNext) {
29
30                ListNode next = curr.next;
31
32                curr.next = prev;
33
34                prev = curr;
35                curr = next;
36            }
37
38            // Connect previous part
39            ListNode temp = groupPrev.next;
40
41            groupPrev.next = kth;
42
43            groupPrev = temp;
44        }
45    }
46}