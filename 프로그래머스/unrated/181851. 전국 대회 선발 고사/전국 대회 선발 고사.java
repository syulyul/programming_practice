import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int idx = 0;
        int r = 1;
        int[] selected = new int[3];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < rank.length; i++) {
            hm.put(rank[i], i);
        }
        
        while(idx < 3){
            if(attendance[hm.get(r)])
                selected[idx++] = hm.get(r);
            r++;
        }
        return selected[0] * 10000 + selected[1] * 100 + selected[2];
    }
}