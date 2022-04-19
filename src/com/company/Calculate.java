package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    Scanner scanner = new Scanner(System.in);
    public void realizarOperacao(){
        try {
            System.out.println("Entre com um número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Entre com outro número: ");
            double num2 = scanner.nextDouble();

            double b = Math.pow(num1, 2);
            double c = Math.pow(num2, 2);

            double a = Math.sqrt(b + c);

            System.out.println("O resultado da operação é: " + a);
        }catch(InputMismatchException e){
            System.out.println("O índice informado não é um número!");
        }
    }
}
