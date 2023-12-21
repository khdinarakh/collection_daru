package com.company.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputSquare {
    public static void main(String[] args) {
        System.out.println("Input вещественное число: ");
        Scanner scanner = new Scanner(System.in);

        try {
            Double number = scanner.nextDouble();
            if (number < 0) {
                throw new IllegalArgumentException("Error! Negative number!");
            }

            double sqrt = Math.sqrt(number);
            System.out.println(sqrt);
        } catch (NumberFormatException  e) {
            System.out.println("Not correct number!");
        }catch (IllegalArgumentException e) {
            System.out.println("Error!: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Not number! Input Number");
        }
    }
}
