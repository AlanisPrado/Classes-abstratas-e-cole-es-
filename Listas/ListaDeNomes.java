/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author alenis
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes dos usuarios (digite 'sair' para encerrar):");

        while (true) {
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break; // Encerra a leitura se o usuário digitar "sair"
            }

            nomes.add(nome); // Adiciona o nome à lista
        }

        // Ordena a lista de nomes em ordem alfabética
        Collections.sort(nomes);

        // Exibe a lista de nomes ordenada
        System.out.println("\nLista de nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close(); // Fecha o scanner
    }
}

