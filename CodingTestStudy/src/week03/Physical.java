package week03;

import java.util.Arrays;

public class Physical {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // n = 5 lost= 1 4 5 reserve = 2 5
        // lost 1 3 -1 reserve 2 -1

        // 잃어버린 사람과 여분의 체육복이 있는 사람이 같을 경우 빌려줄 수 없음
        // 하지만 체육복을 가지고 있으므로 answer++
        // 이에 해당하는 학생을 -1로 처리
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 체육복 빌려주기
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                // 둘 중 하나가 0이면 빌려주거나 빌릴 수 없음
                if(lost[i]== -1 || reserve[j] == -1){
                    continue;
                }
                // 이웃한 학생끼리만 빌려줄 수 있다
                // 두 학생의 차의 절대값이 1이면 체육복을 빌려줄 수 있음
                // 빌려준 학생과 빌린 학생은 -1로 처리
                if(Math.abs(lost[i]-reserve[j]) == 1){
                    answer++;
                    reserve[j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
//테스트 케이스 13, 18번 실패