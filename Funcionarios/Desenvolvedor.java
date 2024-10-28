/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author alenis
 */
public class Desenvolvedor extends Funcionario {

    private double horaExtra;

    public Desenvolvedor(double horaExtra, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
    }

    public double calcularSalario() {
        return horaExtra * 10 + salarioBase;
    }

    @Override
    public String emitirHolerite() {
        return "HOLERITE DO DESENVOLVEDOR \nDesenvolvedor " + nome + "\nSalario Base: " + salarioBase + ", Hora Extras : " + horaExtra + "\nSalario Total: " + calcularSalario();
        
        

    }
}
