import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] spell = my_string.toCharArray();

        for (int i = s; i < e; i++, e--) {
            char tmp = spell[i];
            spell[i] = spell[e];
            spell[e] = tmp;
        }
        
        for (char c : spell) {
            answer += c;
        }
        
        return answer;
    }
}