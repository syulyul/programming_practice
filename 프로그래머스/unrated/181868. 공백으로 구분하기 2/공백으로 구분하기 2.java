import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        if (my_string.charAt(0) == ' ') {
            for (int i = 0; i < my_string.length(); i++) {
                my_string.replace(" ", "");
                if (my_string.charAt(i) != ' ') {
                    my_string = my_string.replaceAll("\\s+", " ");
            answer = my_string.split(" ");
                    answer = Arrays.copyOfRange(answer, 1, answer.length);
                }
            }
        } else {
            my_string = my_string.replaceAll("\\s+", " ");
            answer = my_string.split(" ");
        }
        
        my_string = my_string.replaceAll("\\s+", " ");
        
        return answer;
    }
}