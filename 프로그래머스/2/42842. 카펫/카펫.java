class Solution {
    public int[] solution(int brown, int yellow) {
        int[] ret = new int[2];
        int y = 3;
        
        for (int x = 3; x < brown + yellow; x++) {
            y = (brown + yellow) / x;
            
            if ((x - 2) * (y - 2) == yellow) {
                ret[0] = y;
                ret[1] = x;
                break;
            }
        }
        
        return ret;
    }
}