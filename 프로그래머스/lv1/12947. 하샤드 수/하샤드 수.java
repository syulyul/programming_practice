class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str_x = String.valueOf(x);
        int num = 0;
        
        for (int i = 0; i < str_x.length(); i++) {
            num += (str_x.charAt(i) - '0');
        }
        
        if (x % num != 0) answer = false;
        
        return answer;
    }
}