/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Cines.AdmCines;
import Cines.Cine;
import Cines.Utils;
import DataBase.BD;
import DataBase.LocalDB;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    /*
    0- Hacer un menu de usuario. OK
    1- Agregar 3 Peliculas OK
    2- Imprimir Programacion 
        crear una Funcion para la pelicula (horario, cine, sala,...)
            crear cines.>1 OK
                crear sala >1 OK
            crear peliculas OK    
    3- Vender Entrada
    4- Imprimir entrada
    5- Imprimir Arquitectura cines. OK
    
    
    */
    public static void main(String[] args) {
        System.out.println("Programa funciona");
        /*
        AdmCines admCines= new AdmCines();
        Cine cine1= admCines.addCine("hoyts");
        admCines.addSala(cine1, 100);
        admCines.addSala(cine1, 10);
        
        BD db = new LocalDB();
        System.out.println(db.getListaCines().get(0).getNombreCine());
        
        System.out.println(db.getListaCines().get(0).getListaSalas().get(0).getNumeroSala());
        System.out.println(db.getListaCines().get(0).getListaSalas().get(0).getCantButaca());
        
        System.out.println(db.getListaCines().get(0).getListaSalas().get(1).getNumeroSala());
        System.out.println(db.getListaCines().get(0).getListaSalas().get(1).getCantButaca());
        */
        CommandCLI consola =new CommandCLI();
        consola.runMenu();

        //BD db = new LocalDB();
        //System.out.println("Cine de DB: " + db.getListaCines().get(0).getNombreCine());
        //System.out.println("Sala de DB: " + db.getListaCines().get(0).getListaSalas().get(0).getCantButaca());
        //System.out.println("Pelicula 1: "+ db.getListaPelicula().get(0).getNombre());
        //System.out.println("Pelicula 2: "+ db.getListaPelicula().get(1).getNombre());
        //System.out.println("Pelicula 3: "+ db.getListaPelicula().get(2).getNombre());
    }
    
}
