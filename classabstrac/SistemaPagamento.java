/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classabstrac;

import java.util.Scanner;

/**
 *
 * @author alenis
 */
public class SistemaPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha sua forma de pagamento");
        System.out.println("1 - Pagamento em Boleto");
        System.out.println("2 - Pagamento em Cartao");
        int opcao = scan.nextInt();

        System.out.print("Informe o valor do pagamento: ");
        double valor = scan.nextDouble();

        Pagamento pagamento;

        switch (opcao) {
            case 1:
                pagamento = new PagamentoBoleto(valor);
                break;
            case 2:
                pagamento = new PagamentoCartao(valor);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        pagamento.processarPagamento();
    }
}