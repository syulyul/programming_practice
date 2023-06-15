class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int k = 0;
        String str = "";
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
          str = "";
          for (int j = k; j < k + pat.length(); j++) {
            str += myString.charAt(j);
          }
          if (pat.equalsIgnoreCase(str)) {
            answer = 1;
            return answer;
          }
          k++;
        }
        return answer;
    }
}