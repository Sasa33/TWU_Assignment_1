public class FizzBuzz {
    private int number;

    public FizzBuzz(int i) {
        this.number = i;
    }

    public void print() {
        for(int i = 1; i <= this.number; i++) {
            boolean canDividedBy3Exactly = i % 3 == 0;
            boolean canDividedBy5Exactly = i % 5 == 0;
            if(canDividedBy3Exactly) {
                System.out.print("Fizz");
            }
            if(canDividedBy5Exactly) {
                System.out.print("Buzz");
            }
            if(!canDividedBy3Exactly && !canDividedBy5Exactly) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
