package patternn;

public class InvertedandRotatedHalfPyramid {
    public static void main(String[] args) {
        int x = 6;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }


    }
}
