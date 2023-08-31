import java.lang.Math;

class Solution {
    public int solution(int balls, int share) {
        return comb(balls, share);
    }
    
    public int comb (int n, int r) {
        r = Math.min(r, n - r);
        
        if (r == 0) return 1;
        else if (r == 1) return n;
        else return comb(n - 1, r) + comb(n - 1, r - 1);
    }
}

