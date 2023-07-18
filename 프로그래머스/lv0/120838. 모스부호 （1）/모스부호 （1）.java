class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        
        for (int i = 0; i < letterArr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letterArr[i].equals(morse[j])) {
                    answer += (char) ('a' + j);
                }
            }
        }
        
        return answer;
    }
}