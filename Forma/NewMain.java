/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Forma;

/**
 *
 * @author alenis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0); // Raio de 5
        Forma retangulo = new Retangulo(4.0, 6.0); // Largura de 4 e altura de 6

        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
    }
    
}
