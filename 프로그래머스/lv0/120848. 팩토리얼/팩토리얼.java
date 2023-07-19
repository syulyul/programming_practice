class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        int idx = 0;
        
        while(fact <= n) {
            idx++;
            fact *= idx;
            if (fact > n) break;
        }
        answer = idx - 1;
        
        return answer;
    }
}