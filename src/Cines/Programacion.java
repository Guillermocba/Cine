/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import DataBase.BD;
import DataBase.LocalDB;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Programacion {
    
    private ArrayList<Funcion> listaFunciones;
    
    public void printProgramacion(){
      BD db= new LocalDB();
      listaFunciones=db.getListaFunciones();
    }
    
}
