package week03;

// 문자열 압축하기
// 테스트 케이스 예시
// "aabbaccc"	7
// 문자열을 1개 단위로 잘라 압축했을 때 가장 짧습니다.
// "ababcdcdababcdcd"	9
// 문자열을 8개 단위로 잘라 압축했을 때 가장 짧습니다.

public class ZipString {
    public int solution(String s) {

        int answer = 0;
        int count = 1;
        int[] index = new int[s.length()];

        // 동일한 문자들이 반복되는 경우
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++) {
                // 같은 문자가 반복되면 count를 1씩 증가
                if (s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    // 더 이상 같은 문자가 반복되지 않으면 이전까지의 count값을 index에 저장
                    index[i] = count;
                }
            }
        }
        // abcabc 이런식으로 반복될때는...??
        // substring을 쓰면...될거같은데...
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j < s.length(); j++){
                if(s.substring(i, i+j) == s.substring(i+j+1, i+1+j+j)){
                    // j의 간격으로 스트링을 잘라서 비교
                    index[i] = 2*j + 1;
                }
            }
        }



        return answer;
    }
}
