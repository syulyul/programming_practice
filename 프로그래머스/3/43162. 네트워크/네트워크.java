import java.util.*;

class Solution {
    
    private void visitAll(int computer, int[][] computers, boolean[] isVisited) {
        Stack<Integer> s = new Stack<>();
        s.push(computer);
        
        while (!s.isEmpty()) {
            int idx = s.pop();
            
            if (isVisited[idx]) continue;
            isVisited[idx] = true;
            
            for (int next = 0; next < computers[idx].length; next++) {
                if (computers[idx][next] == 0) continue;
                s.push(next);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        boolean[] isVisited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (isVisited[i]) continue;
            visitAll(i, computers, isVisited);
            answer++;
        }
        
        return answer;
    }
}