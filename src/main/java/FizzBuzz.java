public class FizzBuzz {
    private int number;

    public FizzBuzz(int i) {
        this.number = i;
    }

    public void print() {
        for(int i = 1; i <= this.number; i++) {
            if(i % 3 == 0) {
                if(i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
