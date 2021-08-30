package week02;

class Watermelon {
    public static String solution(int n) {
        String answer = "";
        String str = "수박";
        if(n%2 == 0){
            answer = str.repeat(n/2);
        }else{
            answer = str.repeat(n/2) + "수";
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.print(solution(5));
    }
}
// 프로그래머스에서는 답이 맞는데 repeat이 왜 적용이 안되는지 아직 해결을 하지 못했다 ㅜㅜ
