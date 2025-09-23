class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        ans = len(nums) - k
        return nums[ans]
        