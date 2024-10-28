/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Midea;

/**
 *
 * @author alenis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Midia v1 = new Video("Lucas beto");
        Midia m1 = new Musica("Sol nao se vaai");
        
        v1.reproduzir();
        v1.pausar();
        
        m1.reproduzir();
        m1.pausar();
    }
    
}
