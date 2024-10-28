/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midea;

/**
 *
 * @author alenis
 */
public abstract class Midia {
    protected String titulo;

    public Midia(String titulo) {
        this.titulo = titulo;
    }
    
    public abstract void reproduzir();
    public abstract void pausar();
    
}
