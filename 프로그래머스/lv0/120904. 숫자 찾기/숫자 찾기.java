class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num_s = num + "";
        for (int i = 0; i < num_s.length(); i++) {
            if (num_s.charAt(i) == k + '0') {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}