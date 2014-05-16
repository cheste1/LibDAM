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


package objetos;

import utilidades.Aleatorios;
import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Matriz {

    private int[][] matriz;
    
    private int filas;
    
    private int columnas;
    
    
    
    
    public Matriz() {

        matriz = new int[0][0];
        
        filas = 0;
        
        columnas = 0;
    }
    
    public Matriz (int cuadrada) {
        
        matriz = new int[cuadrada][cuadrada];
        
        filas = cuadrada;
        
        columnas = cuadrada;
   
    }
    
    
    public Matriz(int filas, int columnas) {
        
        matriz = new int[filas][columnas];
        
        this.filas = filas;
        
        this.columnas = columnas;
        
    }
    
    
    public Matriz(int[][] matriz) {
        
        this.matriz = matriz; 
        
        if (matriz != null) {
            
            this.filas = matriz.length;
        
            this.columnas = Matrices.getColumnas(matriz);
            
        }
  
    }
    
    public boolean isNull() {
        return matriz == null;
        
    }
    
    public int[][] getMatriz() {
        
        return matriz;
    }

    @Override
    public String toString() {
        
        return Matrices.toText(matriz);
    }
    
    public void aleatoria () {
        
        if (filas != columnas) {
            
            
            filas = columnas;
        }

        matriz = Aleatorios.toMatrizMultiEntre(filas, -filas, filas);
        
 
    }
    
    public void simetrica(){
        
       if (filas != columnas) {
            
            
            filas = columnas;
        }
       
       matriz = Matrices.getSymmetric(filas);
        
        
    }
    
    public void transponer() {
        
        Matrices.trasponerMultiple(matriz);  
    }
    
    public int getFilas() {
        return filas;
    }
    
    public int getColumnas() {
        
        return columnas;
    }
    
    public void setValor(int valor, int fila, int columna) {
        
        matriz[fila][columna] = valor;
        
    }
    
    public int getValor(int fila, int columna) {
        
        return matriz[fila][columna];
    }
    
    
    
    
    
    
   

    
}
