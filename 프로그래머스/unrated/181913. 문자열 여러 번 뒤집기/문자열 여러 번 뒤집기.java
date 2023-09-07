class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder rev;
        
        for (int i = 0; i < queries.length; i++) {
            rev = new StringBuilder(sb.substring(queries[i][0], queries[i][1] + 1)).reverse();
            sb.replace(queries[i][0], queries[i][1] + 1, rev.toString());
        }
        
        return sb.toString();
    }
}