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
    private ArrayList<Funcion> listaFunciones= new ArrayList(); // esta reemplaza a la tabla funciones
    private ArrayList<Pelicula> listaPeliculas= new ArrayList(); // esta reemplaza a la tabla Peliculas
    private ArrayList<Cine> listaCine= new ArrayList(); // esta reemplaza a la tabla Cines
    
    @Override
    public ArrayList<Funcion> getListaFunciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pelicula> getListaPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPelicula(String nombre) {
        Pelicula pelicula = new Pelicula (nombre);
    }

      
    
}
