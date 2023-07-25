class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String str = my_string.toLowerCase();
        String[] s = str.split("[a-zA-Z]+");
    
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                answer += Integer.parseInt(s[i]);
            }
        }
        
        return answer;
    }
}