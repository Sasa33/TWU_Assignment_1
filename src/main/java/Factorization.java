import java.util.ArrayList;
import java.util.List;

public class Factorization {
    private int number;
    private ArrayList<Integer> primeNumbers;

    public Factorization(int i) {
        this.number = i;
    }

    public void generate() {
        primeNumbers = new ArrayList<>();

        int n = this.number;

        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeNumbers.add(n);
        }

        this.print(primeNumbers);
    }

    private void print(ArrayList<Integer> numbers) {
        int length = numbers.size();
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(numbers.get(i));
                System.out.print(",");
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }
}
