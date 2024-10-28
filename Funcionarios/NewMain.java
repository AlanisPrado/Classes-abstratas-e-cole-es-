/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author alenis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario gerente = new Gerente(1500.0,"Amanda Prado", 5000.0);
        Funcionario desenvolvedor = new Desenvolvedor(20, "Carlos", 3000.0);
        Funcionario gerente2 = new Gerente(1500.0,"Fernando Jacinto", 5000.0);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(gerente2);
        

        empresa.emitirHolerites();
    }

}
