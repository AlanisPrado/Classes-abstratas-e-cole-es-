/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author alenis
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");

        // Lê a frase do usuário
        String frase = scanner.nextLine();
        
        // Divide a frase em palavras
        String[] palavras = frase.split("\\s+"); // Divide por espaços em branco

        // Cria um HashMap para armazenar a contagem de palavras
        HashMap<String, Integer> contagem = new HashMap<>();

        // Conta as ocorrências de cada palavra
        for (String palavra : palavras) {
            palavra = palavra.toLowerCase(); // Ignora maiúsculas/minúsculas
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        // Exibe a contagem de palavras
        System.out.println("\nContagem de palavras:");
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close(); // Fecha o scanner
    }
}

