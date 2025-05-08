/*
 * Esse arquivo principal foi gerado pela task Gradle 'init'
 */
package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Selecione um teste de API Collections (1-5):");
            System.out.println("1. Lista de Compras");
            System.out.println("2. Conjunto de Alunos");
            System.out.println("3. Fila de Notificações");
            System.out.println("4. Estoque de Produtos");
            System.out.println("5. Ranking de Palavras");
            System.out.print("> ");
            int valor = input.nextInt();
            System.out.println("");

            switch (valor) {
                case 1 -> {
                    ListaCompras lc = new ListaCompras();
                    lc.listaCompras();
                }

                case 2 -> {
                    
                }

                case 3 -> {
                    
                }

                case 4 -> {
                    
                }

                case 5 -> {
                    
                }

                default -> throw new AssertionError();
            }
        }
    }
}