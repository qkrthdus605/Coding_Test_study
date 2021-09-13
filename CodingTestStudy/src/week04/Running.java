package week04;

// participant : 참여 선수들
// completion : 완주한 선수
// 한 명을 제외하고는 모두 완주를 했다. completion의 길이는 participant 길이보다 1작다.
// 동명이인이 있을 수 있다.

import java.util.Arrays;
import java.util.List;

public class Running {
    public String solution(String[] participant, String[] completion) {
        String answer = ""; // 완주하지 못한 선수의 이름을 return
        List<String> par_list = Arrays.asList(participant);
        List<String> com_list = Arrays.asList(completion);
        int count = 0;

        // 알파벳 순으로 선수들 이름을 정렬한다.
        Arrays.sort(completion);   // ana mislav stanko
        Arrays.sort(participant);  // ana mislav mislav stanko

        for(int i = 0; i < completion.length; i++){
            for(int j = 0; j < participant.length; j++){
                if(completion[i] == participant[j]){
                    count++;
                }
                if(count == 0){
                    answer = participant[j];
                }else if(count > 1){ // 동명이인이 있을 경우
                    par_list.remove(participant[j+1]);
                    com_list.remove(completion[i]);
                }
            }
        }

        return answer; // mislav
    }
}
