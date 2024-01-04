import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] prevRank = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            prevRank[score[i]] = i + 1;

            if (i < k - 1) {
                result[i] = pq.peek();
            } else {
                while (prevRank[pq.peek()] <= i - k + 1) {
                    pq.poll();
                }

                result[i] = pq.peek();
            }
        }

        return result;
    }
}