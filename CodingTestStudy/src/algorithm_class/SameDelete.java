package algorithm_class;

import java.util.ArrayList;

//N 개의 숫자들의 배열이 있다. 이 배열 안에 있는 숫자들 중 일부는 값들이 서로 같다.
//다시 말해, 어떤 숫자는 배열 안에 두 번 이상 저장되어 있다. 배열 안에 있는 중복된 숫자들을 모두 제거하는 알고리즘을 작성하라.
//그 알고리즘의 시간복잡도는 O(n log n)이어야 한다.
//(힌트: 분할 정복을 사용하는 시간복잡도가 O(n log n)인 정렬 알고리즘을 이용하라.)

public class SameDelete {
    // 퀵 정렬 함수
    public static int[] quickSort(int[] N, int low, int high){
        if(low < high){
            int mid = partition(N, low, high);
            quickSort(N, low, mid-1);
            quickSort(N, mid, high);
        }

        // 중복 제거
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : N){
            if(!list.contains(num)){
                list.add(num);
            }
        }
        return N;
    }
    // 정렬 전 분할 함수
    private static int partition(int[] N, int low, int high){
        int i = low + 1;
        int j = high;

        while(i <= j){
            if(N[i] <= N[j]){
                i = i + 1;
            }else if(N[j] > N[low]){
                j = j-1;
            }else{
                swap(N, N[i], N[j]);
                i = i + 1;
                j = j - 1;
            }
        }
        swap(N, N[low], N[j]);
        return j;
    }
    // 요소를 교환하는 swap 함수
    private static void swap(int[] N, int i, int j){
        int temp = N[i];
        N[i] = N[j];
        N[j] = temp;
    }

    public static void main(String[] args){

        int[] arr = {1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9};

        System.out.println(quickSort(arr, 0, 11));
    }
}
