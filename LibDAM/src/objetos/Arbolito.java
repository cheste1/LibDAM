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

import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Arbolito {
    
    
    private int[][] arbol;
    
    
    private int columnas;
    
    private int filas;
    
    
    
    public Arbolito() {
    
        columnas = 20;
        
        filas = 23;
        
        crearArbolito();
        
    
    
    
    }
    
    public String getString () {
        
        String matriz;
        
        matriz = Matrices.toText(arbol);
        
        return matriz;
        
        
    }
    
    
    private void crearArbolito() {
        
            int rama = 1;
            
            int eje = filas / 2;
        
            arbol = new int[columnas][filas];
        
            for (int i = 0; i < columnas; i++) {
                
                for (int j = 0; j < filas; j++) {
                    
                    System.out.println("j:" + j + "rama:" + rama);
                    
                    if (j < eje + rama && j > eje - rama) {
                        
                        arbol[i][j] = 1;
                    } else {
                        
                        arbol[i][j] = 0;
                    }
                    
                    
                }
                
                rama++;
                
            }
        

    }
    
}
