import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> idx = new ArrayList<>();
        boolean flag = false;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (num[i] == numbers[j]) {
                    flag = true;
                }
            }
            if (flag == false) {
                idx.add(i);
            }
            flag = false;
        }
        
        for (int i = 0; i < idx.size(); i++) {
            answer += idx.get(i);
        }
        
        return answer;
    }
}