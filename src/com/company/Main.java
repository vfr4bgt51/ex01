package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("arg.len: " + args.length);
        System.out.println("arg0: " + args[0]);
        System.out.println("arg1: " + args[1]);
        System.out.println("arg2: " + args[2]);

        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
