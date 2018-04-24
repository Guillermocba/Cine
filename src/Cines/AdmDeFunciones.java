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
public abstract class AdmDeFunciones {
    private Date fechaFuncion;
    private Date horaFuncion;
    private Programacion programacion;
    
    public AdmDeFunciones(){
    programacion = new Programacion();
    }
    
    public void printProgramacion(){ //esto se hace aca para aprobechar el encapsulamiento
    programacion.printProgramacion();
    }
    
    public abstract void habilitarFuncion();
    public abstract void addFuncion();
}
