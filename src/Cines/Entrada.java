/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Entrada {
    private String numeroEntrada;
    private Date fechaVenta;
    private int numeroFuncion;
    private int numeroSala;
    private String tipoEntrada; //mayor, menor, jubilados
    private String nombrePelicula;
    private Date fechaFuncion;
    private Date horaFuncion;
    private float precio;

    public Entrada(String numeroEntrada, Date fechaVenta, int numeroFuncion, int numeroSala, String tipoEntrada, String nombrePelicula, Date fechaFuncion, Date horaFuncion, float precio) {
        this.numeroEntrada = numeroEntrada;
        this.fechaVenta = fechaVenta;
        this.numeroFuncion = numeroFuncion;
        this.numeroSala = numeroSala;
        this.tipoEntrada = tipoEntrada;
        this.nombrePelicula = nombrePelicula;
        this.fechaFuncion = fechaFuncion;
        this.horaFuncion = horaFuncion;
        this.precio = precio;
    }
    
    
    
    
}
