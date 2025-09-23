class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        for i in range(0,m):
            for j in range(0,n):
                if(matrix[i][j] == target):
                    return True
        return False