/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author alenis
 */
import java.util.HashSet;
import java.util.Scanner;

public class ConjuntoDePalavrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> palavrasUnicas = new HashSet<>();

        System.out.println("Digite várias frases (digite 'sair' para encerrar):");

        while (true) {
            String frase = scanner.nextLine();

            if (frase.equalsIgnoreCase("sair")) {
                break; // Encerra a leitura se o usuário digitar "sair"
            }

            // Divide a frase em palavras e as adiciona ao HashSet
            String[] palavras = frase.split("\\s+"); // Divide por espaços em branco
            for (String palavra : palavras) {
                palavrasUnicas.add(palavra.toLowerCase()); // Adiciona a palavra em minúsculas
            }
        }

        // Exibe as palavras únicas
        System.out.println("\nPalavras únicas:");
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }

        scanner.close(); // Fecha o scanner
    }
}

