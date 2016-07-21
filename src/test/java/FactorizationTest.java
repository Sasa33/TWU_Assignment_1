import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FactorizationTest {
    Factorization factorization;

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
    public void should_print_empty_list_when_input_number_is_1() {
        factorization = new Factorization(1);

        factorization.generate();

        String expectedOutput = "";

        assertEquals(outContent.toString(), expectedOutput);
    }

    @Test
    public void should_print_factors_increasingly_when_input_number_is_30() {
        factorization = new Factorization(30);

        factorization.generate();

        String expectedOutput = "2,3,5";

        assertEquals(outContent.toString(), expectedOutput);
    }
}