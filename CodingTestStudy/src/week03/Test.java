package week03;

import java.util.ArrayList;

public class Test {
    public static ArrayList<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0; // 수포자1의 정답 수
        int count2 = 0; // 수포자2의 정답 수
        int count3 = 0; // 수포자3의 정답 수

        // 답을 많이 맞힌 수포자를 담을 배열
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i%5]){
                count1++;
            }
            if(answers[i] == two[i%8]){
                count2++;
            }
            if(answers[i] == three[i%10]){
                count3++;
            }
        }
        // count의 최대값 구하기
        int max = Math.max(count1, Math.max(count2, count3));
        // 최대값과 count1/2/3의 값이 같으면 추가
        if(count1 == max){
            answer.add(1);
        }
        if(count2 == max){
            answer.add(2);
        }
        if(count3 == max){
            answer.add(3);
        }
        return (answer);
    }

    public static void main(String args[]) {
        int[] answer = {1, 3, 4, 2, 5};

        System.out.println(solution(answer));
    }
}


