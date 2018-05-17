/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Cines.Cine;
import Cines.Funcion;
import Cines.Pelicula;
import Cines.Utils;
import java.util.ArrayList;

/**
 *
 * @author Yo
 */
public class LocalDB extends BD {
    private static ArrayList<Funcion> listaFunciones= new ArrayList(); // esta reemplaza a la tabla funciones
    private static ArrayList<Pelicula> listaPeliculas= new ArrayList(); // esta reemplaza a la tabla Peliculas
    private static ArrayList<Cine> listaCine= new ArrayList(); // esta reemplaza a la tabla Cines
    
    @Override
    public ArrayList<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    @Override
    public ArrayList<Pelicula> getListaPelicula() {
        return listaPeliculas;
    }

    @Override
    public ArrayList<Cine> getListaCines() {
        return listaCine;
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
    public Cine validarCine() {
        Cine cine;
        System.out.print("Nombre de Cine: ");
        String nombre =Utils.readStringCLI();
        cine=buscarCine(nombre);
        return cine;
    }  
        public Pelicula validarPelicula() {
        Pelicula pelicula;
        System.out.print("Nombre de Pelicula: ");
        String nombre =Utils.readStringCLI();
        pelicula=buscarPelicula(nombre);
        return pelicula;
    }  

    private Pelicula buscarPelicula(String nombre) {
        Pelicula pelicula = null;
        for(int i=0;i<listaPeliculas.size();i++){
            if(nombre.equals(listaPeliculas.get(i).getNombre())){
                pelicula=listaPeliculas.get(i);
                break;
            }
        }
        return pelicula;
    }

}
