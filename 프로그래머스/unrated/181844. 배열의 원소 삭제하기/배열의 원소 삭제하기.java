import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            list.add(i);
        }
        
        for (int i : delete_list) {
            list.remove((Integer)i);
        }
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++)  {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}