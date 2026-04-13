import java.util.Scanner;

class SequenceGenerator {
    void generate(int limit) {
        int a = 0, b = 1; // Fibonacci
        int power = 1;    // For powers of 2

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                // Fibonacci part
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            } else {
                // Power of 2 part
                power = power * 2;
                System.out.print(power + " ");
            }
        }
    }
}
class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        SequenceGenerator obj = new SequenceGenerator();
        obj.generate(n);
    }
}