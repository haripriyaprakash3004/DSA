class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = 0
        n = len(nums)
        l = []
        for i in range(n):
            for j in range(i+1,n):
                if(nums[i] + nums[j] == target):
                    return [i,j]
        return l
