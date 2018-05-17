/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import Cines.AdmCines;
import Cines.AdmDeFunciones;
import Cines.Cine;
import Cines.Pelicula;
import Cines.Utils;
import DataBase.BD;
import DataBase.LocalDB;

/**
 *
 * @author CR
 */
public class CommandCLI {
    
    
    private AdmCines admCines= new AdmCines();
    private AdmDeFunciones admFun= new AdmDeFunciones();
    private BD db = new LocalDB();

    private Pelicula pelicula;
    public void printMenu(){
        System.out.print("Menu\n\n"
                + "1-Agregar Cine\n"
                + "2-Agregar Sala\n"
                + "3-Agregar Pelicula\n"
                + "4-Imprimir Programacion\n"
                + "5-Imprimir Cines y Salas\n"
                + "6-Salir\n"
                + "Ingrese opcion: ");
    }
    private boolean runCommand(int option){
       //TO-DO: cambiar cases por enum;
        boolean salir=false;
        switch (option){
            case 1:
                agregarCine();
                break;
            case 2:
                agregarSala();
                break;
            case 3:
                agregarPelicula();
                break;
            case 4:
                break;
            case 5:
                printSalasCines();
                break;
            case 6:
                salir=true;
                break;
            default:
                break;
        }
        return salir;
    }
    public void runMenu(){
        int option =0;
        boolean cmd;
        do {printMenu();
        option = Utils.readIntCLI();
        cmd = runCommand(option);
        }while (!cmd);
        
    }
    
    private void agregarCine(){
        System.out.print("Nombre de Cine: ");
        String nombre = Utils.readStringCLI();
        admCines.addCine(nombre);
     }
    
    private void agregarSala(){
        Cine cine;
        cine = db.validarCine();
        if (cine == null) {
            System.out.println("No existe Cine");
            return;
        }
        System.out.println("Ingrese la cantidad de butacas: ");
        int cant = Utils.readIntCLI();
        admCines.addSala(cine, cant);
    }
    
    private void agregarPelicula(){
        System.out.println("Ingrese nombre de la película: ");
        String nombre=Utils.readStringCLI();
        pelicula=admFun.addPelicula(nombre);
    }

    private void printSalasCines() {
    admCines.printSalasCines();
    }

}
