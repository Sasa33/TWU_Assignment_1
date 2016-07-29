import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class TriangleTest {
    Triangle triangle;

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
    public void should_print_one_star_when_input_number_is_one() {
        triangle = new Triangle(1);

        triangle.print();

        String expectedOutput = "*\n";

        assertEquals(outContent.toString(), expectedOutput);
    }

    @Test
    public void should_print_eight_stars_when_input_number_is_eight() {
        triangle = new Triangle(8, "horizontal");

        triangle.print();

        String expectedOutput = "********\n";

        assertEquals(outContent.toString(), expectedOutput);
    }

    @Test
    public void should_print_stars_horizontally_when_input_argument_specify_horizontal() {
        triangle = new Triangle(3, "horizontal");

        triangle.print();

        String expectedOutput = "***\n";

        assertEquals(outContent.toString(), expectedOutput);
    }


    @Test
    public void should_print_stars_vertically_when_input_argument_specify_vertical() {
        triangle = new Triangle(3, "vertical");

        triangle.print();

        String expectedOutput = "*\n" +
                                "*\n" +
                                "*\n\n";

        assertEquals(outContent.toString(), expectedOutput);
    }

    @Test
    public void should_print_right_triangle_stars_when_input_argument_specify_triangle() {
        triangle = new Triangle(3, "triangle");

        triangle.print();

        String expectedOutput = "*\n" +
                                "**\n" +
                                "***\n\n";

        assertEquals(outContent.toString(), expectedOutput);
    }
}
