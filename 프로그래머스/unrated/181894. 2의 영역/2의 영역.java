import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int first = -1;
        int last = -1;
        ArrayList<Integer> al = new ArrayList<>();
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                first = i;
                break;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) last = i;
        }
        
        if (first == last) {
            if (first == -1 && last == -1) {
                al.add(-1);
            } else {
                al.add(arr[first]);   
            }
        } else {
            for (int i = first; i <= last; i++) {
                al.add(arr[i]);   
            }
        }
        
        System.out.println(first);
        System.out.println(last);
        
        answer = new int[al.size()];
        
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}