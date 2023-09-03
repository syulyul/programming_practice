import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        ArrayList<String> al = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            al.add(my_str.substring(i, end));
        }
        
        return al.toArray(new String[0]);
    }
}