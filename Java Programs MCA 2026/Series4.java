import java.util.Scanner;

class SeriesSum {
    int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

        void calculateSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i);
        }

        System.out.println("Sum of series = " + sum);
    }
}
class Series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        SeriesSum obj = new SeriesSum();
        obj.calculateSum(n);
    }
}