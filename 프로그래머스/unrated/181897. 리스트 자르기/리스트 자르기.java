import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        
        switch (n) {
            case 1: 
                for (int i = 0; i <= slicer[1]; i++) al.add(num_list[i]);
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) al.add(num_list[i]);
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) al.add(num_list[i]);
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) al.add(num_list[i]);
                break;
        }
        
        answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        return answer;
    }
}