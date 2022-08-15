/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.listadeexercicios3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class ListaDeExercicios3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nExercício 1:");
        double nota = 11;
        while (nota < 0 || nota > 10) {
            System.out.println("Entre uma nota ente 0 a 10:");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            } else if (nota >= 0 || nota <= 10) {
                System.out.println("Nota: " + nota);
            }
        }

        System.out.println("\nExercício 2:");
        System.out.println("Nome de usuário:");
        String usuario = sc.next();
        String senha = new String();
        do {
            System.out.println("Senha:");
            senha = sc.next();
            if (usuario.equals(senha)) {
                System.out.println("A senha não pode ser o mesmo que o usuário!");
            }
        } while (usuario.equals(senha));

        System.out.println("\nExercício 3:");
        //String nome = new String();
        //do {
        System.out.println("Nome (maior que 3 caracteres):");
        //nome = sc.next();
        //} while (nome);
        int idade = 0;
        do {
            System.out.println("Idade (0-150):");
            idade = sc.nextInt();
        } while (idade < 0 && idade > 150);
        double salario = 0;
        do {
            System.out.println("Salário");
            salario = sc.nextDouble();
        } while (salario <= 0);
        String sexo = new String();
        do {
            System.out.println("Sexo:");
            sexo = sc.next();
        } while (!sexo.equals("m") && !sexo.equals("f"));
        String estadocivil = new String();
        do {
            System.out.println("Estado civil:");
            estadocivil = sc.next();
        } while (!estadocivil.equals("s") && !estadocivil.equals("v")
                && !estadocivil.equals("c") && !estadocivil.equals("d"));

        System.out.println("\nExercício 4:");
        double a = 80000;
        double b = 200000;
        int ano = 0;
        while (a < b) {
            a = a * 1.03;
            b = b * 1.015;
            ano = ano + 1;
            if (a > b) {
                System.out.println("São necessários " + ano + " anos para A ultrapassar B.");
            } else if (a == b) {
                System.out.println("São necessários " + ano + " anos para igualar.");
            }
        }

        System.out.println("\nExercício 5:");
        System.out.println("População A:");
        a = sc.nextDouble();
        System.out.println("Taxa de crescimento anual:");
        double taxaA = sc.nextDouble();
        System.out.println("População B:");
        b = sc.nextDouble();
        System.out.println("Taxa de crescimento anual:");
        double taxaB = sc.nextDouble();
        ano = 0;
        while (a < b) {
            a = a * taxaA;
            b = b * taxaB;
            ano = ano + 1;
            if (a > b) {
                System.out.println("São necessários " + ano + " anos para A ultrapassar B.");
            } else if (a == b) {
                System.out.println("São necessários " + ano + " anos para igualar.");
            }
        }

        System.out.println("\nExercício 6:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("\nExercício 7:");
        System.out.println("Informe 5 números:");
        double[] n = new double[5];
        System.out.println("1º:");
        n[0] = sc.nextDouble();
        System.out.println("2º:");
        n[1] = sc.nextDouble();
        System.out.println("3º:");
        n[2] = sc.nextDouble();
        System.out.println("4º:");
        n[3] = sc.nextDouble();
        System.out.println("5º:");
        n[4] = sc.nextDouble();
        double aux = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > aux) {
                aux = n[i];
            }
        }
        System.out.println("Maior número: " + aux);

        System.out.println("\nExercício 8:");
        System.out.println("Informe 5 números:");
        System.out.println("1º:");
        n[0] = sc.nextDouble();
        System.out.println("2º:");
        n[1] = sc.nextDouble();
        System.out.println("3º:");
        n[2] = sc.nextDouble();
        System.out.println("4º:");
        n[3] = sc.nextDouble();
        System.out.println("5º:");
        n[4] = sc.nextDouble();
        double soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma = soma + n[i];
        }
        System.out.println("Média: " + soma / n.length + "\n"
                + "Soma: " + soma);

        System.out.println("\nExercício 9:");
        System.out.println("Imprimir somente os números impares entre 1-50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nExercício 10:");
        System.out.println("Informe 2 números inteiros:\n1º:");
        int n1 = sc.nextInt();
        System.out.println("2º:");
        int n2 = sc.nextInt();
        soma = 0;
        if (n1 > n2) {
            for (int i = n2 + 1; i < n1; i++) {
                    System.out.println(i);
                    soma = soma + i;
                }
            } else if (n2 > n1) {
            for (int i = n1 + 1; i < n2; i++) {
                    System.out.println(i);
                    soma = soma + i;
                }
            }
        
        System.out.println("Exercício 11:");
        System.out.println("Soma dos números inteiros entre " + n1 + "-" + n2 + ": " + soma);
        
    }
}
 