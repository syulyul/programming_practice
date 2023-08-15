import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        char[] c = {};

        str = String.valueOf(n);
        
        c = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
            System.out.println(c[i]);
            answer += c[i] - '0';
        }

        return answer;
    }
}