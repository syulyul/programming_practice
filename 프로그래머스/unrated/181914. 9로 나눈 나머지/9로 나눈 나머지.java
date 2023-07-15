class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] s = number.split("");
        
        for (int i = 0; i < s.length; i++) {
            sum += Integer.parseInt(s[i]);
        } 
        System.out.println(sum);
        answer = sum % 9;
        
        return answer;
    }
}