class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;

        while (empty >= a) {
            int r = (empty / a) * b;
            empty = r + empty % a;
            answer += r;
        }

        return answer;
    }
}