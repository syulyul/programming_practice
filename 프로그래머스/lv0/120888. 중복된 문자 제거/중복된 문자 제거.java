import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : arr) {
            list.add(s);
        }
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println(j);
                    list.remove(j);
                    j--;
                }
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}