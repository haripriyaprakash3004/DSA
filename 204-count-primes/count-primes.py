class Solution:
    def countPrimes(self, n: int) -> int:
        if(n <= 2):
            return 0
        prime = [True] * n
        prime[0] = False
        prime[1] = False

        p = 0
        while(p*p < n):
            if(prime[p]):
                for i in range(p*p,n,p):
                    prime[i] = False
            p = p+1
            
        return sum(prime)
        