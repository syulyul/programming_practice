import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        
        Arrays.sort(files, new Comparator<String>() {
            
            public int compare(String o1, String o2) {
                // 파일명에서 head, number, tail 부분 추출
                String[] parsed1 = splitFile(o1);
                String[] parsed2 = splitFile(o2);

                // HEAD 부분을 대소문자 구분 없이 비교
                int headComparison = parsed1[0].compareToIgnoreCase(parsed2[0]);
                if (headComparison != 0) {
                    return headComparison; // HEAD가 다르면 HEAD로 정렬
                }
                
                // HEAD가 같으면 NUMBER 비교 (숫자 값으로 비교)
                int num1 = Integer.parseInt(parsed1[1]);
                int num2 = Integer.parseInt(parsed2[1]);
                if (num1 != num2) {
                    return Integer.compare(num1, num2); // NUMBER가 다르면 숫자 순으로 비교
                }

                // HEAD와 NUMBER가 같으면 원래 순서대로 두 파일을 유지
                return 0; // 같은 경우 원래 순서 유지
            }
        });
        
        return files;
    }
    
    // 파일명에서 head, number, tail을 추출하는 메소드
    private String[] splitFile(String file) {
        String head = "";
        String number = "";
        String tail = "";
        
        // 정규 표현식: 파일명에서 첫 번째 숫자 이전까지는 head, 그 이후부터 첫 번째 숫자부터는 number
        String regex = "([a-zA-Z\\-\\ ]+)(\\d+)(.*)";  // head, number, tail 분리
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(file.toLowerCase());  // 대소문자 구분 없이 처리

        // 매칭이 될 경우 head, number, tail 분리
        if (matcher.find()) {
            head = matcher.group(1);   // 첫 번째 그룹: head
            number = matcher.group(2); // 두 번째 그룹: number
            tail = matcher.group(3);   // 세 번째 그룹: tail (확장자 포함)
        }

        return new String[] {head, number, tail};  // head, number, tail 반환
    }
}