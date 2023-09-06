import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int idx = 0;
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        
        while (idx < arr.length) {
            if (stk.size() == 0) {
                stk.add(al.get(idx));
                idx++;
            } else if (stk.size() > 0 && stk.get(stk.size() - 1) == al.get(idx)) {
                stk.remove(stk.size() - 1);
                idx++;
            } else if (stk.size() > 0 && stk.get(stk.size() - 1) != al.get(idx)) {
                stk.add(al.get(idx));
                idx++;
            }
        }
        if (stk.size() == 0) stk.add(-1);
        
        answer = new int[stk.size()];
        
        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        
        return answer;
    }
}