import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = 1000000;
        
        for (int i = 0; i < queries.length; i++) {            
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    al.add(arr[j]);
                }
            }
            if (al.size() == 0) {
                answer[i] = -1;
            } else {
                for (int j = 0; j < al.size(); j++) {
                    if (al.get(j) < min) {
                        min = al.get(j);
                    }
                }
                answer[i] = min;
            }
            min = 1000000;
        }
        return answer;
    }
}