import java.util.Scanner;

class PrimeSum {

    // Method to check prime
    boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check sum of two primes
    void checkSum(int n) {
        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Cannot be expressed as sum of two prime numbers.");
        }
    }
}
class psum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PrimeSum obj = new PrimeSum();
        obj.checkSum(num);
    }
}