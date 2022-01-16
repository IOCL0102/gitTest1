package com.company;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        System.out.println(x);

        x = x + x;
        System.out.println("x + x ="+ x );
    }
}
