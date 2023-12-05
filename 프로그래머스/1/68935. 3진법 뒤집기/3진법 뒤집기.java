class Solution {
    public int solution(int n) {
        String n3 = Integer.toString(n, 3);

        int answer = n3.charAt(0) - '0';
        for (int i = 1; i < n3.length(); i++) {
            int cnt = 1;
            for (int j = 0; j < i; j++) cnt *= 3;
            answer += cnt * (n3.charAt(i) - '0');
        }
        
        return answer;
    }
}