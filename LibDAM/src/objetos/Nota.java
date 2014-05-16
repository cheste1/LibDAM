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

import excepciones.ValoresIncorrectosException;

/**
 *
 * @author alumno
 */
public class Nota {
    
    private double nota;

    

    public Nota() {
        
    }
    
    
    public Nota(double nota) throws Exception {
       this.nota = calcNota(nota);
    }
    
    /**
     * Si esta aprobado devuelve true
     * @return
     */
    public boolean isAprobado() {
        return nota >= 5;
  
    }
    

    /**
     * Devuelve el valor de una nota.
     * @return
     */
    public double getNota () {
        return nota;
    }
    
    /**
     * Cambia el valor de una nota 
     * @param nota
     * @throws java.lang.Exception
     */
    public void setNota (double nota) throws Exception {
        this.nota = calcNota(nota);   
    }
    
    
    private double calcNota(double nota) throws Exception {
        if (nota < 0 || nota > 10) {
            
            throw new ValoresIncorrectosException();
            
        }
        return nota;
    }
    
    /**
     * @deprecated 
     * Retorna la calificacion de una nota
     * @return
     */
    public String getCalificacion () {
        
        if (nota <= 10 && nota >= 8.5 ) {         
            return "Sobresaliente";
        }  else if (nota < 8.5  && nota >= 7) {        
            return "Notable";
        } else if (nota < 7 && nota >= 6) {
            return "Bien";
        } else if (nota < 6 && nota >= 5) {
            return "Suficiente";
        } else if (nota < 5 && nota >= 3.5) {
            return "Insuficiente";
        } else {
            return "Muy deficiente";
        }
    }
    
    /** 
     * Retorna la calificacion de una nota
     * @return
     */
    public String getNotaAlfabetica () {
        
        if (nota <= 10 && nota >= 8.5 ) {         
            return "Sobresaliente";
        }  else if (nota < 8.5  && nota >= 7) {        
            return "Notable";
        } else if (nota < 7 && nota >= 6) {
            return "Bien";
        } else if (nota < 6 && nota >= 5) {
            return "Suficiente";
        } else if (nota < 5 && nota >= 3.5) {
            return "Insuficiente";
        } else {
            return "Muy deficiente";
        }
    }

    @Override
    public String toString() {
        return String.format("Nota: %.2f, %s", nota, getNotaAlfabetica());   
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nota other = (Nota) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        return hash;
    }
    
    
    
    
    
}
