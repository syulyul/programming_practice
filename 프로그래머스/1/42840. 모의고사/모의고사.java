import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] giveupMath1 = { 1, 2, 3, 4, 5 };
        int[] giveupMath2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] giveupMath3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] score = new int[3];
        int cnt = 0;
        int max = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int rank = 1;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == giveupMath1[cnt++]) {
                score[0]++;
            }
            if (cnt == giveupMath1.length) cnt = 0;
        }
        
        cnt = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == giveupMath2[cnt++]) {
                score[1]++;
            }
            if (cnt == giveupMath2.length) cnt = 0;
        }
        
        cnt = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == giveupMath3[cnt++]) {
                score[2]++;
            }
            if (cnt == giveupMath3.length) cnt = 0;
        }
        
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                al.add(i + 1);
            }
        }
        
        answer = new int[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}