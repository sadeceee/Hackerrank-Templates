package templates;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tim Kilian on 21.02.16.
 */

public class MainTemplate {
    private InputStream in;
    private PrintWriter out;
    private Scanner sc;
    private boolean period = false;

    public void solution() {

    }

    public void run() {
        in = System.in;
        out = new PrintWriter(System.out);
        sc = new Scanner(in);
        long time = System.currentTimeMillis();

        int T = 1;
//        T = readInt();
        while(T-->0)
            solution();

        out.flush();
        if (period) printOut(System.currentTimeMillis() - time + " ms");
        exit();
    }

    public static void main(String[] args) {
        new MainTemplate().run();
    }

    private int readInt() {
        return sc.nextInt();
    }

    private int[] readInt(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = readInt();
        return arr;
    }

    private long readLong() {
        return sc.nextLong();
    }

    private long[] readLong(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = readLong();
        return arr;
    }

    private String readString() {
        return sc.next();
    }

    private double readDouble() {
        return Double.parseDouble(readString());
    }

    private static void printOut(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    private void exit() {
        out.close();
        System.exit(0);
    }
}