class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        if (str1.length() > str2.length()){
            for (int i = 0; i <= str1.length() - str2.length(); i++) {
                if (str1.substring(i, i + str2.length()).equals(str2)) {
                    answer = 1;
                }
            }    
        } else if (str1.equals(str2)){
            answer = 1;
        }
        return answer;
    }
}