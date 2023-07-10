class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        
        while (true) {
            if ((6 * count) % n != 0) {
                count++;
            } else {
                break;
            }
        }
        answer = count;
        
        return answer;
    }
}