import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        
        answer = new int[X.size()];
        
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }
        
        return answer;
    }
}