class Solution {
    public int solution(int order) {
        int answer = 0;
        String order_s = String.valueOf(order);
        
        for (int i = 0; i < order_s.length(); i++) {
            if (order_s.charAt(i) == '3' || order_s.charAt(i) == '6' || order_s.charAt(i) == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}