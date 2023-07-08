import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
//         int[] answer = {};
//         String[] s = myString.split("x");
//         answer = new int[s.length];
        
//         if (myString.charAt(myString.length() - 1) == "x") {
//             s.add("");
//         }
        
//         for (int i = 0; i < s.length; i++) {
//             answer[i] = s[i].length();
//         }
        
//         return answer;
        int[] answer = {};
        String[] s = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (int i= 0; i < s.length; i++) {
            list.add(s[i]);
        }
        
        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add("");
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).length();
        }
        
        return answer;
    }
}