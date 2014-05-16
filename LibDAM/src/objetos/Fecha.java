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


import utilidades.Utilidades;

/**
 * @deprecated 
 * @author alumno
 */
public class Fecha {
    
        private int dia;
    
        private int mes;
    
        private int año;

    public Fecha() {
        
    }
        
        
    
        
        
    public Fecha(int dia, int mes, int año) throws Exception {
            
        if (Utilidades.comprobarFecha(dia, mes, año)) {  
            this.dia = dia;
            this.mes = mes;
            this.año = año;
                
            } else {
                throw new Exception("La fecha es incorrecta");    
            }

        }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return (String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(año));
    }
    
    
        
         
    
        
        
        
        
    
    
}
