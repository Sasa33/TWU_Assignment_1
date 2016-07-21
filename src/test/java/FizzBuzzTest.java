import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void should_print_fizz_buzz_and_numbers_correctly_when_input_number_is_15() {
        fizzBuzz = new FizzBuzz(15);

        fizzBuzz.print();

        String expectedOutput = "1\n" +
                                "2\n" +
                                "Fizz\n" +
                                "4\n" +
                                "Buzz\n" +
                                "Fizz\n" +
                                "7\n" +
                                "8\n" +
                                "Fizz\n" +
                                "Buzz\n" +
                                "11\n" +
                                "Fizz\n" +
                                "13\n" +
                                "14\n" +
                                "FizzBuzz\n";

        assertEquals(outContent.toString(), expectedOutput);
    }
}