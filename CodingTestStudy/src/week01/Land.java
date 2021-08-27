package week01;

public class Land {
    int solution(int[][] land) {
        int answer = 0;
        int[] max = new int[land.length];

        for(int i=0; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++) {
                if(max[i] < land[i][j]){ // max보다 큰 값이 나오면
                    // max의 값을 변경
                    max[i] = land[i][j];
                }
            }
            // answer에 값을 더해준다.
            answer += max[i];
        }
        return answer;
    }
}