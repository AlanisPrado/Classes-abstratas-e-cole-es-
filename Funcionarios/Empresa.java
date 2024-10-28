/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alenis
 */
public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);

    }

    public void emitirHolerites() {
        
        //for-each vai fazer um loop por todos os funcionários que foram adicionados à lista funcionarios. 
        //Em cada passagem do loop, ele pega o próximo funcionário na lista e executa uma ação com ele.
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.emitirHolerite());
            System.out.println("-------------------------------");
        }

    }
}
