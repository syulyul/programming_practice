import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = 1;
        
        while (arr.length > num) {
            num *= 2;
        }
        answer = new int[num];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}