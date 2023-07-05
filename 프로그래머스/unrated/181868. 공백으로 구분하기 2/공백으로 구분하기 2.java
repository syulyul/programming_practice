import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        // String[] answer = {};
        // return answer;
        String[] answer = {};
        String[] split = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < split.length; i ++){
            if(!split[i].equals("")){
                list.add(split[i]);  
            }
        }
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}