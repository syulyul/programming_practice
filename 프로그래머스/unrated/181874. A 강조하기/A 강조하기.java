class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) >= 'B' && myString.charAt(i) <= 'Z') {
            answer += (char)(myString.charAt(i) + ('a' - 'A'));
          } else if (myString.charAt(i) == 'a') {
            answer += (char)(myString.charAt(i) - ('a' - 'A'));
          } else {
            answer += myString.charAt(i);
          }
        }

        return answer;
    }
}