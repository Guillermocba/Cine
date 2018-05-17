/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Funcion {
    private Calendar fechaFuncion;
    private Calendar horaFuncion;
    private int numeroSala;
    private String nombreCine;
    private String nombrePelicula;
    private boolean habilitar;
    
    private Date calcularFinal(int duracion, Date horaFuncion){
        return null;
    }

    public Funcion(Calendar fechaFuncion, Calendar horaFuncion, int numeroSala, String nombreCine, String nombrePelicula, boolean habilitar) {
        this.fechaFuncion = fechaFuncion;
        this.horaFuncion = horaFuncion;
        this.numeroSala = numeroSala;
        this.nombreCine = nombreCine;
        this.nombrePelicula = nombrePelicula;
        this.habilitar = habilitar;

    }
    
    
}
