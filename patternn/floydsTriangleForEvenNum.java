package patternn;

import java.util.Scanner;

public class floydsTriangleForEvenNum {
    public static void main(String[] args) {
        System.out.println("ENetr number ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int  n = 6;
        if (x%2 ==0 ){
            int y = 0 , z = 6;

            for (int i = 0 ; i <= n ; i++){
                for ( int j = 1 ; j<=i ; j++){
                    System.out.print(x+ " ");
                    x+=2 ;
                } System.out.println();
            }
        }
        else{
            for (int i = 0 ; i <= n ; i++){
                for ( int j = 1 ; j<=i ; j++){
                    System.out.print(x+ " ");
                    x+=2;
                } System.out.println();
            }
        }

        }

        }


