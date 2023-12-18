import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>(hs);
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}