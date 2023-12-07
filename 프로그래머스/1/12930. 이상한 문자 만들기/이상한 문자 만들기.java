class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean isEven = true;
        
        for(char c : ch){
            if(c == ' '){
                isEven = true;
                sb.append(' ');
                continue;
            } else if(isEven){
                sb.append(Character.toUpperCase(c));
                isEven = false;
            } else {                
                sb.append(Character.toLowerCase(c));
                isEven = true;
            }
        }
        return sb.toString();
    }
}