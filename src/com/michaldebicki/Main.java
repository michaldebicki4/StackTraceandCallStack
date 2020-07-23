package com.michaldebicki;

import org.w3c.dom.Node;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
//ctr d to ascii exception
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }
        catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }
    private static int divide(){
        int x, y;
//        try {
             x = getInt();
             y = getInt();
            System.out.println("x is " + ", y is " + y);
            return x / y;
//        } catch (NoSuchElementException e){
//            throw new ArithmeticException("no suitable input"); //żeby się odnosił do naszego kodu a nie do jakiś innych
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by 0");
//        }

    }
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the integer ");
        while (true){
            try {
                return s.nextInt();

            } catch (InputMismatchException e){
                // go run again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }

    }
}
