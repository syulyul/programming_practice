import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int idx = 0;
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                for (int j = 0; j < idx; j++) {
                    al.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                idx = i;
                for (int j = idx + 1; j < str_list.length; j++) {
                    al.add(str_list[j]);
                }
                break;
            }
        }
        
        answer = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}