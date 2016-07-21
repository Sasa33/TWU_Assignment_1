import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondTest {
    Diamond diamond;

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
    public void should_print_3_line_isosceles_triangle_when_input_number_is_3() {
        diamond = new Diamond(3);

        diamond.print();

        String expectedOutput = "  *\n" +
                                " ***\n" +
                                "*****\n";

        assertEquals(outContent.toString(), expectedOutput);
    }
}