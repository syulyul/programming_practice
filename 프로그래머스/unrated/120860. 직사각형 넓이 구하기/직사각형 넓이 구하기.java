class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x_max = dots[0][0];
        int x_min = dots[0][0]; 
        int y_max = dots[0][1];
        int y_min = dots[0][1];
        
        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] > x_max) x_max = dots[i][0];
            if (dots[i][0] < x_min) x_min = dots[i][0];
            if (dots[i][1] > y_max) y_max = dots[i][1];
            if (dots[i][1] < y_min) y_min = dots[i][1];
        }
        
        answer = (x_max - x_min) * (y_max - y_min);
        
        return answer;
    }
}