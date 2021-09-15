package week04;

// participant : 참여 선수들
// completion : 완주한 선수
// 한 명을 제외하고는 모두 완주를 했다. completion의 길이는 participant 길이보다 1작다.
// 동명이인이 있을 수 있다.

import java.util.Arrays;

public class Running {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 비교를 편하게 하기 위해 정렬을 먼저 해준다.
        Arrays.sort(participant); // ana mislav mislav stanko
        Arrays.sort(completion);  // ana mislav stanko

        for (int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])) { // 참가자와 완주자를 비교했을 때 다른 사람이 있다면 그 사람을 리턴한다
                answer = participant[i];          // i가 2일때 mislav 와 stanko는 다르기 때문에 participant[2]인 mislav를 리턴한다
                return answer;
            }
        }
        // participant = eden kiki leo
        // completion = eden kiki
        // i=0, 1까지 돌면서 다른 사람을 찾지 못했다. 이런 경우에는 참가자 중 마지막 사람이 완주하지 못한 사람이다
        // for문을 돌면서 찾지 못했다면 마지막 참가자를 리턴한다
        answer = participant[participant.length - 1];
        return answer;
    }
}

