package patternn;

import java.util.Scanner;

class pyramid {
    public pyramid(int x ){
       for(int i = 1 ; i<=x ;i++){
           for (int j = 1 ; j<=i ; j++ ){
               System.out.print(j+" ");
           }
           System.out.println();
       }

    }
}

public class halfPyramid {


    public static void main(String[] args) {
        System.out.println("hey ");
        Scanner sc = new Scanner(System.in);
        pyramid p = new pyramid(8);





    }
}
