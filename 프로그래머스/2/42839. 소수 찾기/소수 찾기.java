import java.util.*;
import java.util.stream.*;

class Solution {
    
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    private Set<Integer> getPrimes(int comb, List<Integer> numbers, Set<Integer> primes) {
        
        // 점화식 구현
        if (isPrime(comb)) primes.add(comb);
        
        // 상태 전이 구현
        for (int i = 0; i < numbers.size(); i++) {
            // numbers.get(i)로 상태 전이 진행
            int nextComb = comb * 10 + numbers.get(i);
            
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            
            // 재귀를 이용하여 전이 상태에 대한 부분 문제를 풀고, 그 결과 집합을 현재 풀고 있는 상태의 결과 집합에 합침
            getPrimes(nextComb, nextNumbers, primes);
        }
            
        return primes;
    }
    
    public int solution(String nums) {
        Set<Integer> primes = new HashSet<>();
        List<Integer> numbers = nums.chars()
            .map(c -> c - '0')
            .boxed()
            .collect(Collectors.toList());
        
        getPrimes(0, numbers, primes);
        return primes.size();
    }
}