/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Cines.Cine;
import Cines.Funcion;
import Cines.Pelicula;
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

      
    
}
