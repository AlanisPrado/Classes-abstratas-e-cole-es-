/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midea;

/**
 *
 * @author alenis
 */
public class Musica extends Midia{

    public Musica(String titulo) {
        super(titulo);
    }
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo musica: " + titulo);
    }
    @Override
    public void pausar() {
        System.out.println("Pausando musica: " + titulo);
    }
}
