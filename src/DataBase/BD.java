/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Cines.Cine;
import Cines.Funcion;
import Cines.Pelicula;
import Cines.Sala;
import java.util.ArrayList;

/**
 *
 * @author Yo
 */
public abstract class BD {
    abstract public ArrayList<Funcion>getListaFunciones();
    abstract public ArrayList<Pelicula>getListaPelicula();
    abstract public ArrayList<Cine>getListaCines();
}
