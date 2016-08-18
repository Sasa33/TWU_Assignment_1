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

        triangle = new Triangle(3, TriangleStyle.vertical);
        triangle.print();

        triangle = new Triangle(3, TriangleStyle.triangle);
        triangle.print();


        diamond = new Diamond(3);
        diamond.print();
        System.out.println();

        diamond = new Diamond(3, "diamond");
        diamond.print();
        System.out.println();

        diamond = new Diamond(3, "diamond", "sasa");
        diamond.print();
        System.out.println();


        fizzBuzz = new FizzBuzz(30);
        fizzBuzz.print();
        System.out.println();


        factorization = new Factorization(1);
        factorization.generate();
        System.out.println();

        factorization = new Factorization(30);
        factorization.generate();
        System.out.println();

        factorization = new Factorization(200);
        factorization.generate();
        System.out.println();
    }
}
