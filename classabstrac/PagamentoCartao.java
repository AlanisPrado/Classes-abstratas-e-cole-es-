/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classabstrac;

/**
 *
 * @author alenis
 */
public class PagamentoCartao extends Pagamento{

    public PagamentoCartao(double valor) {
        super(valor);
    }
    
    @Override
    public void processarPagamento(){
    System.out.println("Processando pagamento com Cartao de Credito no valor de R$" + valor);
        // Lógica de pagamento específica para cartão de crédito
        System.out.println("Pagamento com Cartao de Credito realizado com sucesso.");
    }
}
