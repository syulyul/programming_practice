import java.util.*;

class Solution {
    
    private boolean isConvertable(String beginStr, String targetStr) {
        char[] beginStrArr = beginStr.toCharArray();
        char[] targetStrArr = targetStr.toCharArray();
        
        int diff = 0;
        for (int i = 0; i < beginStrArr.length; i++) {
            if (beginStrArr[i] != targetStrArr[i]) diff++;
        }
        return diff == 1;
    }
    
    private static class State {
        public final String word;
        public final int step;
        
        private State(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        boolean[] isVisited = new boolean[words.length];
        
        Queue<State> q = new LinkedList<>();
        q.add(new State(begin, 0));
        
        while (!q.isEmpty()) {
            State state = q.poll();
            
            if (state.word.equals(target)) {
                return state.step;
            }
            
            for (int i = 0; i < words.length; i++) {
                String next = words[i];
                
                // 상태 전이 검사 및 상태 전이
                if (!isConvertable(state.word, next)) {
                    continue;
                }
                
                if (isVisited[i]) {
                    continue;
                }
                
                isVisited[i] = true;
                q.add(new State(next, state.step + 1));
            }
        }
        return 0;
    }
}