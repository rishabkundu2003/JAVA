class SumDivisibleBy7 {
    void calculate() {
        int sum = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
class div {
    public static void main(String[] args) {
        SumDivisibleBy7 obj = new SumDivisibleBy7();
        obj.calculate();
    }
}