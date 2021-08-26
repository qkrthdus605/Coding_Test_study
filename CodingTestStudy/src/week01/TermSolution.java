package week01;

//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class TermSolution {
    public long[] solution(long x, int n) {
        long[] answer = {};
        // 길이가 n인 배열로 초기화
        answer = new long[n];

        for(int i=0; i < n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }
}
