import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                list.add(my_string.charAt(i) - '0');
            }    
        }
        answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}