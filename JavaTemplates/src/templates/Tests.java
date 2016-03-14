package templates;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by Tim Kilian on 3/14/16.
 */
public class Tests {

    MainTemplate main;

    @Before
    public void setUp() {
        main = new MainTemplate();
    }

    @Test
    public void testcase1() {
        String input = "";
        String expected = "";

        main.in = new ByteArrayInputStream(input.getBytes());
        main.sc = new Scanner(main.in);
        OutputStream out = new ByteArrayOutputStream();
        main.out = new PrintWriter(out);

        main.solve();

        main.out.flush();
        assertEquals(expected, out.toString());
    }
}