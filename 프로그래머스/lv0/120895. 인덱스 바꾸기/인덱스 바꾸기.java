class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = new String[my_string.length()];
        String temp = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            str[i] = String.valueOf(my_string.charAt(i));
        }
        temp = str[num2];
        str[num2] = str[num1];
        str[num1] = temp;
        
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}