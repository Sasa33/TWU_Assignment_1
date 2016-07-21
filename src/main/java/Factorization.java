public class Factorization {
    private int number;

    public Factorization(int i) {
        this.number = i;
    }

    public void generate() {
        int n = this.number;

        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.print(i + ",");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
