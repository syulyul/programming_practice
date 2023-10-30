import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        ArrayList<String> al = new ArrayList<>();
        String str = "";
        
        for(int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                if (picture[i].charAt(j) == '.') {
                    for (int l = 0; l < k; l++) {
                        str += picture[i].charAt(j);
                    }
                } else if (picture[i].charAt(j) == 'x') {
                    for (int l = 0; l < k; l++) {
                        str += picture[i].charAt(j);
                    }
                }
            }
            for (int j = 0; j < k; j++) {
                al.add(str);   
            }
            str = "";
        }

        answer = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}