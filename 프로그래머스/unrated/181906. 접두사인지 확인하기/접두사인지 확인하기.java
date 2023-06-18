class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        
        if (my_string.length() < is_prefix.length()) {
          answer = 0;
        } else {
          str = my_string.substring(0, is_prefix.length());
          if (str.equals(is_prefix)) {
            answer = 1;
          } 
        }
        
        return answer;
    }
}