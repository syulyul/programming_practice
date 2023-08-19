class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        char[] s = new char[str.length()];
        int idx = 0;
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
            s[idx++] = str.charAt(i);
        }
        
        answer = new int[s.length];
        
        for (int i = 0; i < s.length; i++) {
            answer[i] = s[i] - '0';
        }
        
        return answer;
    }
}