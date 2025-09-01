package patternn;

public class charUpdate {
    public static void main(String[] args) {
        int x = 7;
        Character ch = 'A';

        for (int i = 0 ; i <= x ; i ++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}
