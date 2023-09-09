class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = new String[n];
        
        for (int i = 0; i < n; i += 2) {
            str[i] = "수";
        }
        for (int i = 1; i < n; i += 2) {
            str[i] = "박";
        }
        for (int i = 0; i < n; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}