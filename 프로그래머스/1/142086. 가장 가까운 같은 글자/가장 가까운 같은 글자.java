import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> idx = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (idx.containsKey(currChar)) {
                answer[i] = i - idx.get(currChar);
            } else {
                answer[i] = -1;
            }

            idx.put(currChar, i);
        }
        
        return answer;
    }
}