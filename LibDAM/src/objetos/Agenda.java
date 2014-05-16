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
public class Agenda {
    
    private Dia[] dias;
    

    public Agenda() {
        
        
        dias = null;
        
        
    }
    
    
    public void añadirDia(Dia dia) {
        
        if (dias == null) {
            
            dias = new Dia[1];
            
            dias[0] = dia;
        } else {
            
            Dia[] temporal = new Dia[dias.length + 1];
            
            Matrices.clonarDias(dias, temporal);
            
            
            temporal[temporal.length -1 ] = dia;
            
            dias = temporal;
        }
   
    }
    
    public int getDias() {
        
        if (dias == null) {
            return 0;
        } else {
           return dias.length;
        }      
    }
    
    public Dia getDia(int dia) {
        
       return dias[dia];
    }
    
    
    
    /**
     * Comprueba si un dia esta guardado.
     * @param dia
     * @return
     */
    public boolean comprobarDia(Dia dia ) {
        
        boolean resultado = false;
        
        if (dias != null) {
           
            for (Dia dia_en_matriz : dias) {
            
            if (dia_en_matriz.equals(dia)) {
                resultado = true;
                
            }
            
        }
            
            
        }

        return resultado;
    }
    
    public Dia getDiaAleatorio() {
        if (dias == null) {
            return null;
        } else {
            
            return dias[Aleatorios.entre(0, dias.length)];
        }
        
    }
     
        

    /**
     * Devuelve el dia segun la fecha
     * @param fecha
     * @return
     */
    public Dia getDiaBy( Fecha fecha) {
        
        if (dias == null) {
            
            return null;
        } else {
            
            for (Dia dia : dias) {
                
                if (dia.getFecha().equals(fecha)) {
                   return dia; 
                }
                
            }  
        }
        return null;

    }

    @Override
    public String toString() {
        String mensaje = "Contenido agenda:\n";
        
        for (Dia dia : dias) {
            
            mensaje += dia.toString() + "\n";
           
        }
        
        return mensaje;
    }
    
   
    
}
