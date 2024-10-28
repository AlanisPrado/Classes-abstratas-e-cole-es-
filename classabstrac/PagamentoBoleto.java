/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstrac;

/**
 *
 * @author alenis
 */
public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com Boleto Bancario no valor de R$" + valor);
        // Lógica de pagamento específica para boleto bancário
        System.out.println("Pagamento com Boleto Bancario gerado. Aguarde a compensação.");
    }

}
