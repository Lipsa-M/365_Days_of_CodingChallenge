import java.util.Scanner;

public class gcd__re {
    static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int g = gcd(x, y);
        System.out.println(g);
    }
}
