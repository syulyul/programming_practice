import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int[] n = new int[intStrs.length];
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            n[i] = Integer.valueOf(intStrs[i].substring(s, s + l));
            if (n[i] > k) {
                al.add(n[i]);
            }
        }
        
        answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}