import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        while (i < arr.length) {
            if (al.size() == 0) {
                al.add(arr[i]);
                i++;
            } else {
                if (al.get(al.size() - 1) < arr[i]) {
                    al.add(arr[i]);
                    i++;
                } else {
                    al.remove(al.size() - 1);
                }
            }
        }
        
        stk = new int[al.size()];
        
        for (int j = 0; j < al.size(); j++) {
            stk[j] = al.get(j);
        }
        
        return stk;
    }
}