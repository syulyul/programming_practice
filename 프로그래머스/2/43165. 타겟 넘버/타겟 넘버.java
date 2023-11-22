import java.util.*;

class Solution {
    
    private static class State {
        public final int idx;
        public final int acc;
        
        State(int idx, int acc) {
            this.idx = idx;
            this.acc = acc;
        }
    }
    
    public int solution(int[] numbers, int target) {
        Stack<State> s = new Stack<>();
        s.push(new State(0, 0));
        
        int cnt = 0;
        
        while (!s.isEmpty()) {
            State state = s.pop();
            
            if (state.idx == numbers.length) {
                if (state.acc == target) cnt++;
                continue;
            }
            
            s.push(new State(state.idx + 1, state.acc - numbers[state.idx]));
            s.push(new State(state.idx + 1, state.acc + numbers[state.idx]));
        }
        return cnt;
    }
}