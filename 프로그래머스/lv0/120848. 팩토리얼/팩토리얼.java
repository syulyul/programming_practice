class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        
        while(fact <= n) {
            answer++;
            fact *= answer;
            if (fact > n) break;
        }
        
        return answer - 1;
    }
}