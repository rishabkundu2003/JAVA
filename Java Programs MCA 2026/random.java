class RandomNumbers {
    void generate() {
        System.out.println("Random Numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = (int)(Math.random() * 100) + 1;
            System.out.print(num + " ");
        }
    }
}
class random {
    public static void main(String[] args) {
        RandomNumbers obj = new RandomNumbers();
        obj.generate();
    }
}