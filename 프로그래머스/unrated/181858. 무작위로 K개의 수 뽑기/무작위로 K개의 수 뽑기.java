import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        Integer[] array = set.toArray(new Integer[0]);
        
        if (array.length >= k) {
            for (int i = 0; i < k; i++) {
                answer[i] = array[i];
            }    
        } else {
            for (int i = 0; i < array.length; i++) {
                answer[i] = array[i];
            }
            for (int i = array.length; i < k; i++) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}