import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ich on 21.02.2016.
 */
public class S {
    private InputStream in;
    private PrintWriter out;
    private Scanner sc;
    private boolean period = false;

    public void solution() {
        int n = readInt(), max = 0;

        for (int a=1; a<=n; a++)
            for (int b=1; b<=n-a; b++)
                for (int c=1; c<=n-a-b; c++)
                    max = (a*b*c > max) ? a*b*c : max;

        out.println(max);
    }

    public void run() {
        in = System.in;
        out = new PrintWriter(System.out);
        sc = new Scanner(in);

        long time = System.currentTimeMillis();
        solution();
        out.flush();
        if (period) printOut(System.currentTimeMillis()-time+" ms");
        exit();
    }

    public static void main(String[] args) { new S().run(); }

    private int readInt() { return sc.nextInt(); }

    private int[] readInt(int n) {
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = readInt();
        return arr;
    }

    private long readLong() { return sc.nextLong(); }

    private long[] readLong(int n) {
        long[] arr = new long[n];
        for (int i=0; i<n; i++) arr[i] = readLong();
        return arr;
    }

    private String readString() { return sc.next(); }

    private double readDouble() { return Double.parseDouble(readString()); }

    private static void printOut(Object... o) { System.out.println(Arrays.deepToString(o));}

    private void exit() { out.close(); System.exit(0); }
}
