package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// list : 672 672 672 672 224 224 224 168 168 168 168 96 96 96
// 672와 168만 최소공배수의 후보가 될 수 o
// list에서 4개씩 있는 숫자를 뽑고 (count로 개수를 세자 ! )
// 그 수들 중에 작은 수를 고르면 될 듯?

public class LeastCommonMultiple {
    public static int solution(int[] arr) { // 3,4,9,16
        int answer = 0;
        int mul = 1;
        int num[] = new int[arr.length + 1];
        ArrayList<Integer> list = new ArrayList<>(); // 최소공배수 후보를 담은 array

        Arrays.sort(arr);

        // 다 곱한거 : 1728
        for(int i = 0; i < arr.length; i++){
            mul = mul * arr[i];
        }

        for(int i = 0; i < arr.length - 1; i++){
            num[i] = mul / arr[i]; // 576, 432, 192, 108
            list.add(num[i]);

            for(int j = 0; j < arr.length; j++) {

                if (num[i] % arr[j] == 0) {
                        continue;
                } else {
                    System.out.println("펑 : " + list.remove(num[i]));
                    list.remove(num[i]);
                }
            }
        }

        System.out.println(list);

        // 최소 공배수 후보를 담은 배열에서의 최소값이 정답
        answer = Collections.min(list);

        return answer;
    }

    public static void main(String[] args){

        int[] arr = {3, 4, 9, 16};

        System.out.println("최종 : " + solution(arr));
    }
}
