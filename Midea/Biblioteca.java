/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alenis
 */
public class Biblioteca {

    private List<Midia> midias;

    public Biblioteca() {
        midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void reproduzirTodas() {
        for (Midia midia : midias) {
            midia.reproduzir(); // Reproduz todas as mídias na biblioteca
        }

    }

    public void pausarTodas() {
        for (Midia midia : midias) {
            midia.pausar(); // Pausa todas as mídias na biblioteca
        }
    }
}
