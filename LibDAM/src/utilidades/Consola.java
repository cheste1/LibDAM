/*
 * Copyright (C) 2014 Hector Espert Pardo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package utilidades;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hector Espert
 */
public class Consola {
    
     /**
     *  Devuelve un entero leido del teclado. message es el mensaje que le
     * muestras al usuario.
     * @param message
     * @return
     */
    public static int getEntero(String message) {
        int entero = -1;   
        boolean isinteger;
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        
        do{
            System.out.println(message);
            try{
                entero = scan.nextInt();
                isinteger = true;
            }catch( InputMismatchException e ){
                System.out.println("No has introducido un numero entero.");
                //System.out.println(e);
                scan.next();
                isinteger = false;                    
            }
            
        }while(isinteger ==  false);
        
        return entero;
    }
    
    /**
     * Extrae un entero de la consola.
     * @return
     * @throws java.lang.Exception
     */
    public static int getEntero() throws Exception {
        int entero;   
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
            try{
                entero = scan.nextInt();
                return entero;
            }catch( InputMismatchException e ){   
                throw new Exception("El valor introducido no es un número entero") ;
            }
        
    }
    
    /**
     * Extrae un double de la consola.
     * @return
     * @throws Exception
     */
    public static double getDouble() throws Exception {
        double entero;   
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
            try{
                entero = scan.nextDouble();
                return entero;
            }catch( InputMismatchException e ){   
                
                throw new Exception("El valor introducido no es un número") ;
            }
        
    }
    
    /**
     * Devuelve un entero leido del teclado entre varios numeros. message es el mensaje que le
     * muestras al usuario.
     * @param message
     * @param min
     * @param max
     * @return
     */
    public static int getEnteroEntre(String message, int min, int max) {
        
        int entero = -1;
        
        if (min > max) { //Ordenar
            int aux = min;
            min = max;
            max = aux;  
        }
        
        boolean isinteger;
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        
        do{
            System.out.println(message);
            try{
                entero = scan.nextInt();
                isinteger = true;
            }catch( InputMismatchException e ){
                System.out.println("No has introducido un numero entero.");
                //System.out.println(e);
                scan.next();
                isinteger = false;                    
            }
            
        }while(isinteger ==  false || entero < min || entero > max);
        
        return entero;
    }
    
    //Doubles
    
    /**
     * Devuelve un double leido del teclado. message es el mensaje que le
     * muestras al usuario.
     * @param message
     * @return
     */
        
    public static double getDouble(String message) {
        double salida = -1;   
        boolean isdouble;
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        
        do{
            System.out.println(message);
            try{
                salida = scan.nextInt();
                isdouble = true;
            }catch( InputMismatchException e ){
                System.out.println("El valor introducido es erroneo.");
                scan.next();
                isdouble = false;                    
            }
            
        }while(isdouble ==  false);
        
        return salida;
    }
    
    /**
     * Devuelve un double leido del teclado entre los valores indicados en min y max (No incluidos).
     * message es el mensaje que le muestras al usuario.
     * 
     * @param message
     * @param min
     * @param max
     * @return
     */
    public static double getDouble(String message, double min, double max) {
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);

        double entrada = -1;
        boolean isdouble;
                
        do {
            isdouble = true;
            try {
                System.out.println(message);
                entrada = scan.nextDouble();
            } catch (InputMismatchException e) {
                scan.next();
                isdouble = false;
            }
            
        } while ( entrada < min || entrada > max || isdouble == false);   
        return entrada;
    }
    
    /**
     * Estrae un boolean de la consola. yes o y para true. no o no para false.
     * @param message es el mensaje que le muestras al usuario.
     * @return
     */
    public static boolean getBoolean(String message) {
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        
        String respuesta = "";
        
        do {
            System.out.println(message);
            System.out.println("[Y]: Yes");
            System.out.println("[N]: No");
            respuesta = scan.nextLine();
        } while (!respuesta.equalsIgnoreCase("yes") && !respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("y") && !respuesta.equalsIgnoreCase("n"));  
        
        return respuesta.equalsIgnoreCase("yes") || respuesta.equalsIgnoreCase("y");
    }
    
    /**
     * Extrae un String de la consola.
     * @param message es el mensaje que le muestras al usuario
     * @return
     */
    public static String getString(String message) {
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        System.out.println(message);
        return scan.nextLine();
        
    }
    
    /**
     * Extrae un String de la consola.
     * @return
     */
    public static String getString() {
        Scanner scan = new Scanner(System.in, "iso-8859-1");
        scan.useLocale(Locale.UK);
        return scan.nextLine();
    }
    
    
    
    
}
