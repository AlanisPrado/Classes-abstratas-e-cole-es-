/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midea;

/**
 *
 * @author alenis
 */
public class Video extends Midia{

    public Video(String titulo) {
        super(titulo);
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo video: " + titulo);
    }
    @Override
    public void pausar() {
        System.out.println("Pausando video: " + titulo);
    }
    
}
