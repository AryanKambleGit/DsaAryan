package patternn;

public class floydsTriangle {
    public static void main(String[] args) {
        int x = 0 , n = 6;
        
        for (int i = 0 ; i <= n ; i++){
            for ( int j = 1 ; j<=i ; j++){
                System.out.print(x+ " ");
                x++;
            } System.out.println();
        }

    }
}
