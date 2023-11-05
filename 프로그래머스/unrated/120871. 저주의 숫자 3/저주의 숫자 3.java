class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        while (n > 0) {
            boolean x3 = false;
            
            if (num % 3 == 0) {
                x3 = true;
            } else {
                int current = num;
                while (current > 0) {
                    if (current % 10 == 3) {
                        x3 = true;
                        break;
                    }
                    current /= 10;
                }
            }
            
            if (!x3) {
                n--;   
            }
            num++;
        }
        answer = num - 1;
        
        return answer;
    }
}