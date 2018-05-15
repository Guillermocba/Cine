/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import DataBase.BD;
import DataBase.LocalDB;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author CR
 */
public class AdmCines {
    private ArrayList<Cine> listaCine;
    
    public AdmCines(){
        BD db= new LocalDB();
        listaCine= db.getListaCines();
        
    }
    
    public Cine addCine(String nombre){
        Cine cine =new Cine(nombre);
        listaCine.add(cine);
        return cine;
    }
    public Sala addSala(Cine cine,int cantButaca){
        int numSalas =cine.getCantidadSalas();
        Sala sala=new Sala(numSalas+1,cantButaca);
        cine.addSala(sala);
        return sala;
    }

    public void printSalasCines() {
        for(int i=0;i<listaCine.size();i++){
            System.out.println("Cine "+(i+1)+": "+ listaCine.get(i).getNombreCine());
            listaCine.get(i).printSalas();
        }
    }

    public Cine buscarCine(String nombre) {
        Cine cine = null;
        for(int i=0;i<listaCine.size();i++){
            if(nombre.equals(listaCine.get(i).getNombreCine())){
                cine=listaCine.get(i);
                break;
            }
        }
        return cine;
    }

}
