// Last updated: 8/22/2026, 9:34:29 AM
1class Solution {
2    public String[] splitMessage(String message, int limit) {
3
4        int n = message.length();
5
6        // prefix[i] = total number of digits in 1 to i
7        int[] prefix = new int[n + 1];
8
9        for (int i = 1; i <= n; i++) {
10            prefix[i] = prefix[i - 1] + digits(i);
11        }
12
13        // Try number of parts
14        for (int parts = 1; parts <= n; parts++) {
15
16            int partsDigits = digits(parts);
17
18            // Total suffix length:
19            // digits(i) + digits(parts) + 3
20            //
21            // Total available message characters:
22            // parts * limit
23            // - sum of digits(i)
24            // - parts * digits(parts)
25            // - parts * 3
26
27            int totalCapacity =
28                    parts * limit
29                    - prefix[parts]
30                    - parts * partsDigits
31                    - parts * 3;
32
33            if (totalCapacity < n) {
34                continue;
35            }
36
37            String[] answer = new String[parts];
38
39            int index = 0;
40
41            for (int i = 1; i <= parts; i++) {
42
43                String suffix = "<" + i + "/" + parts + ">";
44
45                int available = limit - suffix.length();
46
47                int end = Math.min(index + available, n);
48
49                answer[i - 1] =
50                        message.substring(index, end) + suffix;
51
52                index = end;
53            }
54
55            if (index == n) {
56                return answer;
57            }
58        }
59
60        return new String[0];
61    }
62
63    private int digits(int n) {
64        return String.valueOf(n).length();
65    }
66}