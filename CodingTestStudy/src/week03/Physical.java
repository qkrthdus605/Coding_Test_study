package week03;

public class Physical {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // 여벌의 체육복을 가져온 학생이 더 많거나 같을 때
        if(lost.length <= reserve.length){
            if(lost.equals(reserve)){
                answer = answer - lost.length;
            }else{
                answer = answer + lost.length;
            }
        } else{ // 도난당한 학생이 더 많을 때
            for(int i = 0; i < reserve.length; i++){
                if(lost[i])){
                    answer = answer + (lost.length - reserve.length);
                }else{
                    answer = answer + reserve.length;
                }
            }
        }
        return answer;
    }
}