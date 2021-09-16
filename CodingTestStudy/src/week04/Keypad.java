package week04;

// [2020 카카오 인턴십] 키패드 누르기
// 1,4,7 : 왼손
// 3,6,9 : 오른손
// 2,5,8,0 : 두 손 중에 가까운 손, 거리가 같다면 오른손잡이는 오른손, 왼손잡이는 왼손


public class Keypad {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10; // = *
        int right = 12; // = #


        for(int i = 0; i < numbers.length; i++){

            if(numbers[i]==0){
                // 거리 계산을 위해 0을 11로 치환
                numbers[i] = 11;
            }

            if(numbers[i]%3 == 1){
                // 1, 4, 7 (3으로 나눠 나머지가 1인 숫자)라면 왼손으로 누른다
                answer = answer + "L";
                left = numbers[i];

            }else if(numbers[i]%3 == 0){
                // 3, 6, 9 : 오른손으로 누른다
                answer = answer + "R";
                right = numbers[i];

            }else{
                // 2, 5, 8, 0 : 거리를 계산한 후 가까운 손으로 누른다

                // 왼손, 오른손과의 거리 구하기
                int left_dis = Math.abs((left-numbers[i]))/3 + Math.abs((left-numbers[i]))%3;
                int right_dis = Math.abs((right-numbers[i]))/3 + Math.abs((right-numbers[i]))%3;

                if(right_dis > left_dis){
                    answer = answer + "L";
                    left = numbers[i];
                }else if(right_dis < left_dis){
                    answer = answer + "R";
                    right = numbers[i];
                }else{
                    if(hand.equals("left")){
                        answer = answer + "L";
                        left = numbers[i];
                    }else{
                        answer = answer + "R";
                        right = numbers[i];
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};

//        System.out.println("최종 : " + solution(numbers));
    }
}
