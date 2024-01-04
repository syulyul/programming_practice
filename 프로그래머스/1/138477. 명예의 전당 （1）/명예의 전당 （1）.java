import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            pq.add(score[i]); // 현재 가수의 점수를 우선순위 큐에 추가
            
            // 우선순위 큐의 크기가 k를 초과하면, 큐에서 가장 작은 값을 제거 
            // 이렇게 함으로써 명예의 전당에는 상위 k개의 점수만 유지됨
            if (pq.size() > k) {
                pq.poll();
            }
            
            // 현재까지의 명예의 전당에 있는 최하위 점수를 배열에 저장 
            // PriorityQueue의 peek 메서드는 큐에서 가장 작은 값을 반환
            answer[i] = pq.peek();
        }

        return answer;
    }
}
