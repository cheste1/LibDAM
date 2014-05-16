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

/**
 *
 * @author alumno
 */
public class Examen {
    
    private int preguntas;
    
    //private boolean test;
    
    private int descuenta_buena;
    
    
    public Examen(int preguntas) {
        
     this.preguntas = preguntas;   
        
        
    }
    
    public Examen(int preguntas, int descuenta_buena) throws Exception {
        
        this.preguntas = preguntas;
        
        this.descuenta_buena = comprobarDescuenta(preguntas, descuenta_buena);
   
    }

    public void setPreguntas(int preguntas) {
        this.preguntas = preguntas;
    }

    public int getDescuenta_buena() {
        return descuenta_buena;
    }

    public int getPreguntas() {
        return preguntas;
    }

    @Override
    public String toString() {
        return "Numero de preguntas= " + preguntas; 
    }
    
    private int comprobarDescuenta(int preguntas, int descuenta_buena) throws Exception {
        
           
        if (descuenta_buena == 0 ) {           
            return descuenta_buena;
        } else if (preguntas / descuenta_buena > 1 ) {
            return descuenta_buena;    
        } else {
            throw new Exception("El valor introducido es igual o mayor a las preguntas") ;           
        }
    
    }
    
     
}
