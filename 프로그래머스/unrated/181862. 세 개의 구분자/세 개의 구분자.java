import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        int idx = 0;
        ArrayList<String> al = new ArrayList<>();
        
        String[] str = myStr.split("[abc]");
        
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                idx++;
                al.add(str[i]);
            }
        }
        if (al.size() == 0) {
            al.add("EMPTY");
        }
        
        answer = new String[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}