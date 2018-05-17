/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Cine {
    private String nombreCine;
    private ArrayList<Sala> listaSalas= new ArrayList();

    public Cine(String nombreCine) {
        this.nombreCine = nombreCine;
    }
    public String getNombreCine() {
        return nombreCine;
    }

    public int getCantidadSalas() {
        return listaSalas.size();
    }
    public void addSala(Sala sala){
        listaSalas.add(sala);
    }
    public ArrayList<Sala> getListaSalas(){
        return listaSalas;
    }
    public boolean existeSala(int i){
        return i<=listaSalas.size();
    }
    void printSalas() {
        for(int i=0;i<listaSalas.size();i++){
            System.out.println(String.format("Sala %d: %d butacas",listaSalas.get(i).getNumeroSala(),listaSalas.get(i).getCantButaca()));                 
        }
    }
    
}
