package tech.strategio;

import java.util.*;

public class E01 {
    public static int getNthFib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[n - 1];
        }
    }
}
