class Solution {
    public int[] solution(int brown, int yellow) {
        int[] ret = new int[2];
        
        for (int x = 3; x < brown + yellow; x++) {
            int y = (brown + yellow) / x;
            
            if ((x - 2) * (y - 2) == yellow) {
                ret[0] = y;
                ret[1] = x;
                break;
            }
        }
        
        return ret;
    }
}