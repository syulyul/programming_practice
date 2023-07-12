import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int[] itv_1 = intervals[0];
        int[] itv_2 = intervals[1];
        List<Integer> list = new ArrayList<>();
        
        for (int i = itv_1[0]; i <= itv_1[1]; i++) {
            list.add(arr[i]);
        }
        for (int i = itv_2[0]; i <= itv_2[1]; i++) {
            list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}