package algorithm_class;

//N(> 0)개의 계단을 올라가는 방법의 수를 반복을 이용하여 구하는 θ(N) 알고리즘을 작성하라.

public class Stair {
    public static int solution(int N){
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 2;

        for(int i = 2; i < N; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer[N-1];
    }
    public static void main(String[] args){
        System.out.println("답: " + solution(4));
    }
}
