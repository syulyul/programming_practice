import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }
        
        Integer[] arr = hs.toArray(new Integer[0]);
        int[] answer = new int[arr.length];        
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}