class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long[] thr = new long[t.length() - p.length() + 1];
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            thr[i] = Long.parseLong(t.substring(i, i + p.length()));
        }
        
        for (int i = 0; i < thr.length; i++) {
            if (thr[i] <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}