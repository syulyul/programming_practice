import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] answer = new int[score.length];
        
        if (k <= score.length) {
            for (int i = 0; i < k; i++) {
                al.add(score[i]);
                Collections.sort(al);
                answer[i] = al.get(0);
            }

            for (int i = k; i < score.length; i++) {
                if (score[i] > al.get(0)) {
                    al.remove(0);
                    al.add(score[i]);
                    Collections.sort(al);
                }
                answer[i] = al.get(0);
            }
        } else {
            for (int i = 0; i < score.length; i++) {
                al.add(score[i]);
                Collections.sort(al);
                answer[i] = al.get(0);
            }
        }
        
        return answer;
    }
}