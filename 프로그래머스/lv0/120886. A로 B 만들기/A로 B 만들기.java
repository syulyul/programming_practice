import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] bef = before.split("");
        String[] aft = after.split("");
        
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        for (int i = 0; i < bef.length; i++) {
            if (!bef[i].equals(aft[i])) {
                answer = 0;
                break;
            } else {
                answer = 1;
            }
        }
        
        return answer;
    }
}