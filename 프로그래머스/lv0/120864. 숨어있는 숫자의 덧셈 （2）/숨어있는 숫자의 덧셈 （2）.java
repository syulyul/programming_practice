class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] s = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

    
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                answer += Integer.parseInt(s[i]);
            }
        }
        
        return answer;
    }
}