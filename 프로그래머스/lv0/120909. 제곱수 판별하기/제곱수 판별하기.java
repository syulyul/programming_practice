import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 2;
        double num = Math.sqrt((double) n);
        
        if ((int)num * (int)num  == n) {
            answer = 1;
        }
        
        return answer;
    }
}