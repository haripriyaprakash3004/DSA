class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False
        return [s.index(c) for c in s] == [t.index(c) for c in t]
        