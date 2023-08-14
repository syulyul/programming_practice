import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        int cnt = 2;
        
        while (n > 1) {
            if (n % cnt == 0) {
                al.add(cnt);
                n /= cnt;
            } else {
                cnt++;
            }
        }
        // 중복 제거를 위해 HashSet을 사용
        HashSet<Integer> set = new HashSet<>(al);
        
        // 중복 제거된 요소들을 다시 배열로 변환
        answer = new int[set.size()];
        
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        
        Arrays.sort(answer);

        return answer;
    }
}