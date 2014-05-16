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

import java.util.Random;

/**
 *
 * @author Hector Espert
 * 
 */
public class Aleatorios {

    /**
     * Genera un numero aleatorio entre dos numeros.
     * @param min
     * @param max
     * @return int
     */
    public static int entre(int min, int max) {
        
        //Ordenar
        if (min > max) { 
            int aux = min;
            min = max;      
            max = aux;        
        }
        
        Random aleatorio = new Random();    
        int numale;
        
        do {
            
            numale = aleatorio.nextInt(max);
            
            if (aleatorio.nextBoolean()) {
                
                numale = -numale;
                
            }
            
        } while (numale < min);
        
        return numale;
    }
    
    /**
     *  Genera un numero aleatorio entre dos numeros.
     * @param min
     * @param max
     * @return double
     */
    public static double entre(double min, double max) {
        
        //Ordenar
        if (min > max) { 
            double aux = min;
            min = max;      
            max = aux;        
        }
        
        Random aleatorio = new Random();    
        int numale;
        
        do {
            
            numale = aleatorio.nextInt();
            
            if (aleatorio.nextBoolean()) {
                
                numale = -numale;
                
            }
            
        } while (numale < min && numale > max);
        
        return numale;
    }
    
    /**
     * Devuelve una matrix de enteros aleatorios.
     * num es el tamaño de la matriz
     * @param num
     * @return
     */
    public static int[] toMatriz(int num) {
        
        int[] numeros = new int[num];
        Random aleatorio = new Random();
        
        for (int i = 0; i < numeros.length; i++) {

            int numero = aleatorio.nextInt();
            
            numeros[i] = numero;
            
        }

        return numeros;
    }
    
    /**
     * Devuelve una matrix de enteros aleatorios de 0 a un valor.
     * num es el tamaño de la matriz
     * max es el valor maximo de los aleatorios.
     * @param num
     * @param max
     * @return
     */
    public static int[] toMatriz(int num, int max) {
        
        int[] numeros = new int[num];
        Random aleatorio = new Random();
        
        for (int i = 0; i < numeros.length; i++) {

            int numero = aleatorio.nextInt(max);            
            numeros[i] = numero;
            
        }

        return numeros;
    }
    
    /**
     * Devuelve una matrix de enteros aleatorios entre dos valores.
     * @param num
     * @param min
     * @param max
     * @return
     */
    public static int[] toMatrizEntre (int num, int min, int max) {
        
        int[] numeros = new int[num];
        
        //Ordenar
        if (min > max) { 
            int aux = min;
            min = max;      
            max = aux;        
        }
        
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = entre(min, max);
    
        }    
 
        return numeros;
    }
    
    /**
     * Devuelve una matriz multiplie con numeros aleatorios.
     * @param num
     * @return
     */
    public static int[][] toMatrizMulti(int num) {
        
        int[][] numeros = new int[num][num];
        Random aleatorio = new Random();
        
        for (int[] matriz : numeros) {
            
            for (int i = 0; i < matriz.length; i++) {
             
                matriz[i] = aleatorio.nextInt();
                
                
            }        
        }
        return numeros;
    }
   
    
    /**
     * Devuelve una matriz 
     * @param num
     * @param max
     * @return
     */
    public static int[][] toMatrizMulti(int num, int max) {
        
        int[][] numeros = new int[num][num];
        Random aleatorio = new Random();
        
        for (int[] matriz : numeros) {
            for (int i = 0; i < matriz.length; i++) {
                matriz[i] = aleatorio.nextInt(max);  
            }        
        }
        return numeros;
    }
    
    /**
     *
     * @param num
     * @param min
     * @param max
     * @return
     */
    public static int[][] toMatrizMultiEntre (int num, int min, int max) {
        
        int[][] numeros = new int[num][num];
        
        //Ordenar
        if (min > max) { 
            int aux = min;
            min = max;      
            max = aux;        
        }
        
        
        for (int[] matriz : numeros) {
            for (int i = 0; i < matriz.length; i++) {
                matriz[i] = entre(min, max);   
            }           
        }
        return numeros;
    }
    
    /**
     * Devuelve un boolean aleatorio.
     * @return
     */
    public static boolean getBoolean() {
        Random aleatorio = new Random();
        return aleatorio.nextBoolean();  
    }
    
    /**
     * Devuelve un int aleatorio. 
     * @return
     */
    public static int getInt() {
        Random aleatorio = new Random();
        return aleatorio.nextInt();
    }
    
}
