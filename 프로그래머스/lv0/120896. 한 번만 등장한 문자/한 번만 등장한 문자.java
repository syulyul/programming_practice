import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] str = new String[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i) + "";
        }
        
        Arrays.sort(str);
        
        for(int i = 0; i < str.length; i++) {
            cnt = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}