class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            // 뒤집을 부분 문자열을 추출한 후 뒤집기
            StringBuilder rev = new StringBuilder(sb.substring(start, end + 1)).reverse();
            
            // 원본 문자열에서 뒤집힌 부분을 교체하기
            sb.replace(start, end + 1, rev.toString());
        }
        
        return sb.toString();
    }
}