/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author alenis
 */
public class Gerente extends Funcionario{
    
    private double bonus;

    public Gerente(double bonus, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){ 
        return salarioBase + bonus;
    
        }  
    @Override
    public String emitirHolerite(){
        return "HOLERITE DO GERENTE\nGerente "+nome+"\nSalario Base: "+salarioBase+", bonus : "+bonus+"\nSalario Total: "+calcularSalario(); 
   }
}
