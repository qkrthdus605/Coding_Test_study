package algorithm_class;

// 경품 추첨을 위한 N개의 번호(0보다 큰 정수)들이 있다. 이 번호들은 1부터 N사이의 정수들 중의 하나여야 한다.
// 이 번호들 중 빠진 번호가 있는지를 찾아내는 알고리즘을 구체적이고 명확하게 기술하라. 작성한 알고리즘의 시간복잡도를 θ(Theta)-표기로 나타내라.
// N이 4일 때  1,2,3,3 이렇게 번호를 가지고 있을 경우 빠진 번호가 있고 그 때의 빠진 번호는 4이다.

class Find {
    public boolean solution(int N) {
        // N개의 번호를 담은 배열 
        int[] num = new int[N];
        // 비교를 위한 배열
        int[] compare = new int[N];
        boolean answer = true;

        // 1부터 N까지 담은 배열 생성
        for(int i = 0; i < N; i++){
            compare[i] = i+1;
        }
        for(int j = 0; j < N; j++){
            if(num[j] != compare[j]){
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
    }
}
