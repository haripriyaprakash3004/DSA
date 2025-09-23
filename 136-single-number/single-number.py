class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        d = {}
        for num in nums:
            d[num] = d.get(num,0)+1
        for key in d.keys():
            if(d.get(key) == 1):
                return key
        return -1

        