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
public class Pelicula {

    private String calificacion;
    private String genero;
    private float duracion;
    private Date anioEstreno;
    private String actores;
    private String idionma;
    private boolean subtitulos;
    private String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }
            
    public Pelicula(String nombrePelicula, String calificacion, String genero, float duracion, Date anioEstreno, String actores, String idionma, boolean subtitulos) {
        this.calificacion = calificacion;
        this.genero = genero;
        this.duracion = duracion;
        this.anioEstreno = anioEstreno;
        this.actores = actores;
        this.idionma = idionma;
        this.subtitulos = subtitulos;
        this.nombre = nombre;
    }
    
       
}
