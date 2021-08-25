package week01;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int m=0;
        n = sc.nextInt();
        m = sc.nextInt();
        for(int j=0; j< m; j++){
            for(int i=0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
