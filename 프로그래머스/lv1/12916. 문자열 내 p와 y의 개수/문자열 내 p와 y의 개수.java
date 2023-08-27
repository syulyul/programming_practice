class Solution {
    boolean solution(String s) {
        int y_cnt = 0;
        int p_cnt = 0;
        String str = s.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') y_cnt++;
            else if (str.charAt(i) == 'p') p_cnt++;
        }
        if (y_cnt == p_cnt) return true;
        else return false;
    }
}