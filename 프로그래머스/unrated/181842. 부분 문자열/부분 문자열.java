class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        String s = "";
        int k = 0;

        for (int i = 0; i < str2.length() - str1.length() + 1; i++) {
          s = "";
          for (int j = k; j < k + str1.length(); j++) {
            s += str2.charAt(j);
          }
          k++;
          if (s.equals(str1)) {
            answer = 1;
            return answer;
          }
        }
        
        return answer;
    }
}