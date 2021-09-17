package week04;

// 최소공배수 = 두수의 곱 / 두수의 최대공약수

public class LeastCommonMultiple {
    public static int Max(int a, int b){
        // 최대공약수 구하는 함수
        int max = 0;
        int compare;

        if(a > b){
            compare = b;
        }else{
            compare = a;
        }

        // 둘 중 작은 수까지만 for문을 돌린다.
        // 어차피 약수를 구하는 거니까 많이 돌릴 필요 x
        // 0으로 나누면 오류가 뜨기 때문에 i는 1부터 시작
        for(int i = 1; i <= compare; i++){
            if(a % i == 0 && b % i == 0){
                max = i;
                // 두 수 모두 나누어 떨어지게 만드는 i 가 최대공약수
            }
        }
        return max;
    }

    public static int Min(int a, int b){
        // 최소공배수 구하는 함수
        // 두 수의 곱을 두 수의 최대공약수로 나눠준다.
        int min = (a * b) / Max(a, b);
        return min;
    }

    public static int solution(int[] arr) { // 3,4,9,16
        // for 문 내에서 처음 최소공배수를 구할 때 들어갈 숫자이므로 arr[0]으로 초기화한다.
        int answer = arr[0];

        // arr의 길이가 1일 경우에도 인덱스 에러가 발생하므로 1일때는 처음 요소인 arr[0]을 리턴한다.
        if(arr.length == 1){
            return answer;
        }

        for(int i = 1; i < arr.length; i++){
            // 두 수의 최소공배수를 구한다.
            // 그렇게 구해진 최소공배수와 그 다음 수와의 최소공배수를 구한다
            answer = Min(answer, arr[i]);
        }

        return answer;
    }

    public static void main(String[] args){

        int[] arr = {3, 4, 9, 16};

        System.out.println("최종 : " + solution(arr));
    }
}
