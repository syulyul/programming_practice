import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            // 배열의 길이가 1 이하인 경우, -1을 포함한 배열 반환
            return new int[]{-1};
        } else {
            // 배열을 복사하여 정렬
            int[] sortedArr = Arrays.copyOf(arr, arr.length);
            Arrays.sort(sortedArr);

            // 가장 작은 수 찾기
            int min = sortedArr[0];

            // 가장 작은 수를 제외한 새로운 배열 생성
            int[] answer = new int[arr.length - 1];
            int idx = 0;
            for (int value : arr) {
                if (value != min) {
                    answer[idx++] = value;
                }
            }
            return answer;
        }
    }
}