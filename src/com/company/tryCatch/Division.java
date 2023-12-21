package com.company.tryCatch;

public class Division {
    public static void main(String[] args) {
        try {
            System.out.println(divide(5, 6));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("System cannot divide number to 0");
        }
        return (double) x / y;
    }
}
