package soalPrioritas2;

public class nomor1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n*n; i++) {
            if (i%3 == 0) {
                System.out.print("X ");
            } else if (i%2 == 1) {
                System.out.print("Y ");
            } else {
                System.out.print("Z ");
            }
            if (i%n == 0) {
                System.out.println();
            }
        }
    }
}
