import java.util.ArrayList;

public class Factorization {
    private int number;
    private ArrayList<Integer> primeNumbers;

    public Factorization(int i) {
        this.number = i;
    }

    private void generatePrimeNumbers() {
        primeNumbers = new ArrayList<>();

        int n = this.number;

        int firstPrimeNumber = 2;

        for (int i = firstPrimeNumber; i <= n / i; i++) {
            while (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeNumbers.add(n);
        }
    }

    public void print() {
        generatePrimeNumbers();

        int length = primeNumbers.size();
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(primeNumbers.get(i));
                System.out.print(",");
            } else {
                System.out.print(primeNumbers.get(i));
            }
        }
    }
}
