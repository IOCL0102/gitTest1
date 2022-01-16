package com.company;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        printMenu();
    }

    public static void printMenu(){
        System.out.println("Hello Welcome to my calculator application !");
        System.out.println("Please select 1 or 2");
        System.out.println("-> 1 . Addition");
        System.out.println("-> 2 . Subtraction");
    }
}
