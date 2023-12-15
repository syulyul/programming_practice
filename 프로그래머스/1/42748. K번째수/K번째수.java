import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] arr = {};
        
        for (int i = 0; i < commands.length; i++) {
            arr = new int[commands[i][1] - commands[i][0] + 1];
            arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        
        
        
        return answer;
    }
}