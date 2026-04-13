class Alphabets {
    void display() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
class Alpha {
    public static void main(String[] args) {
        Alphabets obj = new Alphabets();
        obj.display();
    }
}