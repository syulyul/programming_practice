import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        ArrayList<String> rev = new ArrayList<>();
        int start = my_string.length() - 1 - e;
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            rev.add(String.valueOf(my_string.charAt(i)));
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i < s) {
                answer += my_string.charAt(i);
            } else if (i >= s && i <= e) {
                answer += rev.get(start++);
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}