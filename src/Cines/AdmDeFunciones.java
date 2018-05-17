/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import DataBase.BD;
import DataBase.LocalDB;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import sun.security.pkcs11.Secmod;

/**
 *
 * @author Admin
 */
public class AdmDeFunciones {

    private Programacion programacion;

    private ArrayList<Pelicula> listaPeliculas;
    private ArrayList<Funcion> listaFunciones;
    private BD db = new LocalDB();
    public AdmDeFunciones() {
        programacion = new Programacion();
        listaPeliculas = db.getListaPelicula();
        listaFunciones = db.getListaFunciones();

    }

    public void printProgramacion() { //esto se hace aca para aprobechar el encapsulamiento
        programacion.printProgramacion();
    }

    public void habilitarFuncion() {

    }

    public void addFuncion() {
        Cine cine;
        Pelicula pelicula;
        cine = db.validarCine();
        if (cine == null) {
            System.out.println("No existe Cine");
            return;
        }
        System.out.println("Sala: ");
        int sala = Utils.readIntCLI();
        if (!cine.existeSala(sala)) {
            System.out.println("No existe Sala");
            return;
        }
        pelicula=db.validarPelicula();
        if (pelicula == null) {
            System.out.println("No existe Pelicula");
            return;
        }
        Calendar fechaFuncion =Calendar.getInstance() ;
        System.out.println("Mes: ");
        int mes = Utils.readIntCLI();
        System.out.println("Dia: ");
        int dia = Utils.readIntCLI();
        
        fechaFuncion.set(Year.now().getValue(), mes, dia);
        System.out.println("HORA HH:mm : ");
        Calendar horaFuncion=Utils.readHour();
        
        Funcion func = new Funcion(fechaFuncion, horaFuncion, sala, cine.getNombreCine(), pelicula.getNombre(), false);
        listaFunciones.add(func);
    }

    public Pelicula addPelicula(String nombre) {
        Pelicula pelicula = new Pelicula(nombre);
        listaPeliculas.add(pelicula);
        return pelicula;
    }
}
