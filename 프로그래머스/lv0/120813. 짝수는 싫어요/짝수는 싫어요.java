class Solution {
    public int[] solution(int n) {
        int[] answer;
        int idx = 0;
        
        if ((n & 1) == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        
        for (int i = 1; i <= n; i+=2) {
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
}