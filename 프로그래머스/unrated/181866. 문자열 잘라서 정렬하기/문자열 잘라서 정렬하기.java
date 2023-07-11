import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] arr = {};
        List<String> list = new ArrayList<>();
        
        arr = myString.split("x");
        // for (String a:arr){
        //     System.out.println(a);
        // }
        Arrays.sort(arr);
        // return arr;
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}