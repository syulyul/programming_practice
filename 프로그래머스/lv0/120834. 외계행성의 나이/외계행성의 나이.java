class Solution {
    public String solution(int age) {
        String answer = "";
        
        for (int i = 0; i < String.valueOf(age).length(); i++) {
            answer += (char)(String.valueOf(age).charAt(i) - ('0' - 'a'));
        }
        
        return answer;
    }
}