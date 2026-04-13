import java.util.Scanner;

class SequenceGenerator {

    void generate(int limit) {
        int a = 2, b = 1, c = 4;

        for (int i = 1; i <= limit; i++) {

            if (i % 3 == 1) {
                // First term of group
                System.out.print(a + " ");
                a = a * 2;  // doubling pattern

            } else if (i % 3 == 2) {
                // Second term
                System.out.print(b + " ");
                b = b - 1;  // decreasing

            } else {
                // Third term
                System.out.print(c + " ");
                c = c + 6;  // increasing by 6
            }
        }
    }
}
class Series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        SequenceGenerator obj = new SequenceGenerator();
        obj.generate(n);
    }
}