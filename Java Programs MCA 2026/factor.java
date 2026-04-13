import java.util.Scanner;

class Factors {
    void displayFactors(int num) {
        System.out.println("Factors are:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factors obj = new Factors();
        obj.displayFactors(num);
    }
}