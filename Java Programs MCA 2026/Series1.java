import java.util.Scanner;

class SequenceGenerator {

    void generate(int limit) {
        int a = 0, b = 1;   // Fibonacci
        int evenNum = 1;    // Start for even sequence

        for (int i = 1; i <= limit; i++) {

            if (i % 2 != 0) {
                // Fibonacci part
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;

            } else {
                // Even position part
                int index = i / 2;

                // Sign logic
                if (index % 3 == 1) {
                    System.out.print(-evenNum + " ");
                } else {
                    System.out.print(evenNum + " ");
                }

                evenNum += 3;
            }
        }
    }
}
class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        SequenceGenerator obj = new SequenceGenerator();
        obj.generate(n);
    }
}