class Solution(object):
    def isAnagram(self, s, t):
        if(len(s) != len(t)):
            return False
        s1 = sorted(s)
        s2 = sorted(t)
        for i in range(len(s)):
            if(s1[i] != s2[i]):
                return False
        return True
        