import java.util.*;

class Solution {
    
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    private void getPrimes(int comb, int[] numbers, boolean[] isUsed, 
                           Set<Integer> primes) {
        
        // 점화식 구현
        if (isPrime(comb)) primes.add(comb);
        
        // 상태 전이 구현
        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            
            // numbers[i]로 상태 전이 진행
            int nextComb = comb * 10 + numbers[i];
            
            isUsed[i] = true;
            getPrimes(nextComb, numbers, isUsed, primes);
            isUsed[i] = false;
        }
    }
    
    public int solution(String nums) {
        Set<Integer> primes = new HashSet<>();
        int[] numbers = nums.chars().map(c -> c - '0').toArray(); // 수정
        getPrimes(0, numbers, new boolean[numbers.length], primes); // 수정
        return primes.size();
    }
}