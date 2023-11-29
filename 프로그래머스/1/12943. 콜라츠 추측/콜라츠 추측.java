class Solution {
    public int solution(int num) {
        int cnt = 0;
        long n = (long) num;
        
        if (n == 1) return 0;
        
        while (n != 1 && cnt != 500) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 2 != 0) {
                n = n * 3 + 1;
            }
            cnt++;
        }
        if (n != 1) return -1;

        return cnt;
    }
}