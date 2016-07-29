public class ShowResults {

    public static void main(String[] args) {
        Triangle triangle;
        Diamond diamond;
        FizzBuzz fizzBuzz;
        Factorization factorization;

        triangle = new Triangle(1);
        triangle.print();
        System.out.println();

        triangle = new Triangle(8);
        triangle.print();
        System.out.println();

        triangle = new Triangle(3, "vertical");
        triangle.print();

        triangle = new Triangle(3, "triangle");
        triangle.print();


        diamond = new Diamond(3);
        diamond.print();

        diamond = new Diamond(3, "diamond");
        diamond.print();

        diamond = new Diamond(3, "diamond", "sasa");
        diamond.print();


        fizzBuzz = new FizzBuzz(30);
        fizzBuzz.print();



        factorization = new Factorization(1);
        factorization.generate();

        factorization = new Factorization(30);
        factorization.generate();
    }
}
