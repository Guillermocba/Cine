/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CR
 */
public class Utils {

    static private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static private Scanner scanner = new Scanner(System.in);

    static public String readStringCLI() {
        String valor = "";
        try {
            valor = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }

    static public int readIntCLI() {
        return scanner.nextInt();
    }
    static public Calendar readHour(){
        String valor=readStringCLI();
        
        String[] parts = valor.split(":");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
        cal1.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
        System.out.println(cal1.toString());
        return cal1;
    }
}
