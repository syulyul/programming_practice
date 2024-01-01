import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for (int n : tangerine) {
            if (hs.containsKey(n)) {
                hs.put(n, hs.get(n) + 1);
            } else {
                hs.put(n, 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> el = new LinkedList<>(hs.entrySet());
        el.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        
        for (Map.Entry<Integer, Integer> entry : el) {
            if (k > 0) {
                int count = Math.min(k, entry.getValue());
                k -= count;
                answer++;
            }
        }
        
        return answer;
    }
}