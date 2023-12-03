class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int cnt = 2;
        int min = 1;
        int max = 1;
        int tmp = 0;
        
        if (n > m) {
            tmp = n;
            n = m;
            m = tmp;
        }
        
        while (cnt <= m) {
            if (n % cnt == 0 && m % cnt == 0) {
                max *= cnt;
                n /= cnt;
                m /= cnt;
            } else {
                cnt++;
            }
        }
        answer[0] = max;
        answer[1] = answer[0] * n * m;
        
        
        return answer;
    }
}