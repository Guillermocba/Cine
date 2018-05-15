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
 * @author Admin
 */
public class AdmDeFunciones {
    private Date fechaFuncion;
    private Date horaFuncion;
    private Programacion programacion;
    
    private ArrayList<Pelicula> listaPeliculas;
    public AdmDeFunciones(){
    programacion = new Programacion();
    BD db= new LocalDB();
    listaPeliculas=db.getListaPelicula();
    
    }
    
    public void printProgramacion(){ //esto se hace aca para aprobechar el encapsulamiento
    programacion.printProgramacion();
    }
    
    public void habilitarFuncion(){
        
    }
    public void addFuncion(){
        
    }
    
    public Pelicula addPelicula(String nombre){
        Pelicula pelicula =new Pelicula(nombre);
        listaPeliculas.add(pelicula);
        return pelicula;
    }
}
