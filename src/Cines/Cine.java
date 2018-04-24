/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

/**
 *
 * @author Admin
 */
public class Cine {
    private String nombreCine;
    private int numeroSala;

    public Cine(String nombreCine, int numeroSala) {
        this.nombreCine = nombreCine;
        this.numeroSala = numeroSala;
    }
    public String getNombreCine() {
        return nombreCine;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    
}
