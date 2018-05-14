/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;
import Cines.AdmCines;
import Cines.Cine;
import Cines.Pelicula;
import Cines.Sala;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CR
 */
public class CommandCLI {
    
    private Scanner scanner = new Scanner(System.in);
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private AdmCines admCines= new AdmCines();
    private Cine cine;
    private Pelicula pelicula;
    public void printMenu(){
        System.out.print("Menu\n\n"
                + "1-Agregar Cine\n"
                + "2-Agregar Sala\n"
                + "3-Agregar Pelicula\n"
                + "4-Imprimir Programacion\n"
                + "5-Salir\n"
                + "Ingrese opcion: ");
    }
    private void runCommand(int option){
        
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
                break;    
            default:
                break;
        }
    }
    public void runMenu(){
        int option =0;
        do {printMenu();
        option = scanner.nextInt();
        runCommand(option);
        }while (option !=5);
        
    }
    
    private String readStringCLI(){    
        String valor="";
        try {
            valor = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CommandCLI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }
    
    private void agregarCine(){
        System.out.print("Nombre de Cine: ");
        String nombre =readStringCLI();
        cine= admCines.addCine(nombre);
     }
    
    private void agregarSala(){
        System.out.println("Ingrese la cantidad de butacas: ");
        int cant=scanner.nextInt();
        admCines.addSala(cine, cant); 
    }
    
    private void agregarPelicula(){
        System.out.println("Ingrese nombre de la película: ");
        String nombre=readStringCLI();
        pelicula=admCines.addPelicula(nombre);
    }
}
