class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean[] bool = new boolean[my_string.length()];
        
        for (int idx : indices) {
            bool[idx] = true;
        }
        for (int i = 0; i < my_string.length(); i++) {
            if (bool[i] == true) {
                continue;
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}