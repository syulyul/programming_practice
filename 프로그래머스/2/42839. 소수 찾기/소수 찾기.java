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
    
    private Set<Integer> getPrimes(int comb, List<Integer> numbers) {
        // if (numbers.isEmpty()) {
        //     if (isPrime(comb)) return Set.of(comb);
        //     return Set.of();
        // }
        
        Set<Integer> primes = new HashSet<>();
        // 점화식 구현
        if (isPrime(comb)) primes.add(comb);
        
        // 종료 조건에서 acc의 소수 여부에 따라 집합을 생성하는 부분이 점화식에서 처음 집합을 생성하는 부분과 중복되는 것을 해결
        // if (numbers.isEmpty()) return primes; // 종료 조건에서 numbers 가 빈 리스트이므로 isEmpty()로 메서드를 종료하지 않아도 아래 for문에서 numbers에 포함된 원소가 없기 때문에 수행되지 않고 primes를 반환하므로 필요 없음
        
        // 상태 전이 구현
        for (int i = 0; i < numbers.size(); i++) {
            // numbers.get(i)로 상태 전이 진행
            int nextAcc = comb * 10 + numbers.get(i);
            
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            
            // 재귀를 이용하여 전이 상태에 대한 부분 문제를 풀고, 그 결과 집합을 현재 풀고 있는 상태의 결과 집합에 합침
            primes.addAll(getPrimes(nextAcc, nextNumbers));
        }
            
        return primes;
    }
    
    public int solution(String nums) {
        List<Integer> numbers = nums.chars()
            .map(c -> c - '0')
            .boxed()
            .collect(Collectors.toList());
        
        return getPrimes(0, numbers).size();
    }
}