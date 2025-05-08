/*
 * Esse arquivo principal foi gerado pela task Gradle 'init'
 */
package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> listaCompras = new ArrayList<>();

        listaCompras.add("Pêra");
        listaCompras.add("Maçã");
        listaCompras.add("Manga");
        listaCompras.add("Manga");
        listaCompras.add("Bolo de cenoura");

        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println("Produto "+(i+1)+": "+listaCompras.get(i));
        }
        System.out.println("Quantia total de produtos no carrinho: "+listaCompras.size());
    
        System.out.println("\nRemovendo primeira instância de 'Manga' do carrinho\n");
        listaCompras = listaCompras.stream().distinct().toList();

        for (int i = 0; i < listaCompras.size(); i++) {
            System.out.println("Produto "+(i+1)+": "+listaCompras.get(i));
        }
        System.out.println("Quantia total de produtos no carrinho: "+listaCompras.size());

    }
}