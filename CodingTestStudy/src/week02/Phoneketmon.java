package week02;

import java.util.ArrayList;

class Phoneketmon {
    public int solution(int[] nums) { [3, 1, 2, 3], 2
        int answer = 0;
        int size = (nums.length)/2;
        // 중복되는 폰켓몬의 종류를 담을 배열
        ArrayList<Integer> same = new ArrayList<>();

        // 중복체크
        for(int i = 0; i < nums.length; i++){
            if(!same.contains(nums[i])){
                same.add(nums[i]);
            }
        }

//        가져갈 수 있는 폰켓몬의 수가 종류의 개수보다 클 경우
        if(size >= same.size()){
            // 그때의 최댓값은 종류의 개수가 된다.
            answer = same.size();
        }else{ // 그게 아니면
            // 가져갈 수 있는 폰켓몬의 수가 답이 된다.(각각 다른 종류의 폰켓몬을 고를 경우)
            answer = size;
        }

        return answer;
    }
}