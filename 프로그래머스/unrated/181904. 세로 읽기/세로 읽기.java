import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
    
        String answer = "";
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < my_string.length() - m + 1; i++) {
            al.add(my_string.substring(i, i + m));
            i += m - 1;
        }
        
        for (int i = 0; i < my_string.length() / m; i++) {
            answer += al.get(i).charAt(c - 1);
        }
        
        return answer;
    }
}