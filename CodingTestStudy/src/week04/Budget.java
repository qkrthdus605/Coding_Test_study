package week04;

import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int compare = 0; // 예산과 비교를 위한 변수
        Arrays.sort(d); // 작은 금액 순으로 정렬

        for(int i = 0; i < d.length; i++){
            if(compare + d[i] <= budget){  // 지원하기로 한 곳에 다음 지원하기로 한 곳을 더한 값이 예산을 넘으면 안된다
                answer++; // 예산을 넘지 않으면 +1
                compare += d[i]; // 다음 비교를 위해 compare에 지원하기로 한 곳의 금액을 더해 업데이트 해준다.
            }
        }
        return answer;
    }
    public static void main(String[] args){

        int[] d = {2, 2, 3, 3};

        System.out.println("최종 : " + solution(d, 10));
    }
}
