# Last updated: 8/11/2026, 2:20:09 PM

from typing import List
from math import gcd
from collections import Counter

class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        counts = Counter(deck).values()
        
        g = 0
        for count in counts:
            g = gcd(g, count)
        
        return g > 1
        