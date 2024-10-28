package org.example;

import java.util.Scanner;

public class desafioPerfil {
    public static void main(String[] args) {
        String nome;
        double nota=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome ?");
        nome = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println(nome+" qual a sua "+(i+1)+"° nota ?");
            nota += scanner.nextDouble();
            System.out.println(nota);
        }
        System.out.println(nome+" a sua media foi de: "+Math.round(nota/3));
    }
}
