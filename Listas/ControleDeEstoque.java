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

public class ControleDeEstoque {
    private HashMap<String, Integer> estoque;

    public ControleDeEstoque() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        estoque.put(nome, estoque.getOrDefault(nome, 0) + quantidade);
        System.out.println("Produto adicionado: " + nome + " (Quantidade: " + quantidade + ")");
    }

    public void removerProduto(String nome) {
        if (estoque.containsKey(nome)) {
            estoque.remove(nome);
            System.out.println("Produto removido: " + nome);
        } else {
            System.out.println("Produto não encontrado: " + nome);
        }
    }

    public void atualizarQuantidade(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            estoque.put(nome, quantidade);
            System.out.println("Quantidade atualizada para: " + nome + " (Nova quantidade: " + quantidade + ")");
        } else {
            System.out.println("Produto não encontrado: " + nome);
        }
    }

    public void exibirEstoque() {
        System.out.println("\nEstoque atual:");
        for (Map.Entry<String, Integer> entrada : estoque.entrySet()) {
            System.out.println("Produto: " + entrada.getKey() + ", Quantidade: " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleDeEstoque controleEstoque = new ControleDeEstoque();
        
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Exibir estoque");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    controleEstoque.adicionarProduto(nomeAdicionar, quantidadeAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();
                    controleEstoque.removerProduto(nomeRemover);
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int quantidadeAtualizar = scanner.nextInt();
                    controleEstoque.atualizarQuantidade(nomeAtualizar, quantidadeAtualizar);
                    break;

                case 4:
                    controleEstoque.exibirEstoque();
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

