/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Cines.Funcion;
import Cines.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Yo
 */
public abstract class BD {
    abstract public ArrayList<Funcion>getListaFunciones();
    abstract public ArrayList<Pelicula>getListaPelicula();
    abstract public void addPelicula(String Nombre);
}
