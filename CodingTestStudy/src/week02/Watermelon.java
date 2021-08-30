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
