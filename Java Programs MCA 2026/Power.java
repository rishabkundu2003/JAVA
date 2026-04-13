import java.util.Scanner;

class PowerCalculator {
    void calculate(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
    }
}
class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        PowerCalculator obj = new PowerCalculator();
        obj.calculate(base, exp);
    }
}