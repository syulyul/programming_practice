class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        
        for (int x = i; x <= j; x++) {
            s += String.valueOf(x);
        }
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == (k + '0')) {
                answer++;
            }
        }
        
        return answer;
    }
}