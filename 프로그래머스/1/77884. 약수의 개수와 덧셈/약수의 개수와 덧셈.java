class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            int idx = 1;
            
            while (idx <= i) {
                if (i % idx == 0) cnt++;
                idx++;
            }
            
            if (cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}