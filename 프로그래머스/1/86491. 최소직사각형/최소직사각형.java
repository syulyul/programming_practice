class Solution {
    public int solution(int[][] sizes) {
        int max0 = 1;
        int max1 = 1;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] >= sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
            
            for (int j = 0; j < sizes.length - 1; j++) {
                if (sizes[i][0] > max0) max0 = sizes[i][0];
                if (sizes[i][1] > max1) max1 = sizes[i][1];
            }
        }
        return max0 * max1;
    }
}