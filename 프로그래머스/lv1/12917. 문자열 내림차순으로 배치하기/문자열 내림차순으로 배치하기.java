import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        
        Arrays.sort(c);
        
        StringBuilder sb = new StringBuilder(String.valueOf(c));
        answer += sb.reverse().toString();
        
        return answer;
    }
}