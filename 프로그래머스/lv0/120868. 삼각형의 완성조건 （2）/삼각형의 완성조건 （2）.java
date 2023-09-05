class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sideMax = 0;
        int side = 0;
        
        sideMax = Math.max(sides[0], sides[1]);
        for (int i = sideMax; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        side = Math.min(sides[0], sides[1]);
        for (int i = sideMax - side + 1; i < sideMax; i++) {
            answer++;
        }
        
        return answer;
    }
}