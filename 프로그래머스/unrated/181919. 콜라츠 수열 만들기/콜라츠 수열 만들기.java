import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int x = n;
        list.add(n);

        // if (x == 1) {
        //   list.add(x);
        //   return answer = list.stream().mapToInt(i->i).toArray();
        // }
        while (x != 1) {
          if ((x & 1) == 0) {
            x /= 2;
            list.add(x);
          } else if ((x & 1) == 1){
            x = 3 * x + 1;
            list.add(x);
          }
        }
        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}