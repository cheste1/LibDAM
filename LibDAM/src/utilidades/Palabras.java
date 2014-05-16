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


/**
 *
 * @author Hector Espert
 */
public class Palabras {

    
    private static final String vocales = "aeiouAEIOU";

    /**
     * Cuenta las vocales de una string
     * @param palabra
     * @return Devuelve el numero de vocales
     */
    public static int contarVocales(String palabra) {
        char[] mletras = vocales.toCharArray();
        char[] dividida = palabra.toCharArray();
        int n_vocales = 0;
        for (char letra : dividida) {
            for (char compara : mletras) { 
                if (compara == letra) {   
                    n_vocales++;
                } 
            }       
        }
        return n_vocales;
    }

    /**
     *  Convierte un string en una matriz de enteros
     * @param s_matriz
     * @return
     */
    public static int[][] stringtoMatrizMulti (String s_matriz) { 
        s_matriz = Palabras.quitarCambioLinea(s_matriz);
        String[] filas = s_matriz.split("\n");
        int n_filas = filas.length;       
        String[] columnas = filas[0].split(" ");
        int n_columnas = Matrices.filtarNumeros(columnas).length;
        int[][] matriz = new int[n_filas][n_columnas];      
        for (int i = 0; i < n_filas; i++) {       
            columnas = filas[i].split(" ");   
            matriz[i] = Matrices.filtarNumeros(columnas); 
        }
         return matriz;
    }
    
    /**
     * Elimina el ultimo cambio de linea de un string
     * @param texto
     * @return
     */
    public static String quitarCambioLinea(String texto) {
        int length = texto.length();
        if (texto.substring(length - 1, length).equalsIgnoreCase("\n")) {   
            texto = texto.substring(0, length -1);   
        }
        return texto;  
    }

    /**
     *  Quita un simbolo de un string
     * @param texto
     * @param simbolo
     * @return
     */
    public static String quitarSimbolo(String texto,String simbolo) {
        String resultado = ""; 
        for (int i = 0; i < texto.length(); i++) {
            String temporal = texto.substring( i, i + 1);   
            if (!temporal.equals(simbolo)) {        
                resultado += temporal;
            } 
        }
        return resultado;
    }

    
    
    
    
    
}
