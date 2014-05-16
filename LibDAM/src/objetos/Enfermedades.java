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

import java.util.Arrays;
import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Enfermedades {
    
    private Enfermedad[] enfermedades;

    public Enfermedades() {
        enfermedades = null;
    }
    
    public Enfermedades(Enfermedad enfermedad) {
        enfermedades = new Enfermedad[1];
        
        enfermedades[0] = enfermedad;
        
        
    }

    public Enfermedad[] getEnfermedades() {
        return enfermedades;
    }
    
    
    
    public Enfermedad getByID(String cod_enf) {   
        for (Enfermedad enfermedad : enfermedades) {          
            if (enfermedad.getCod_enf() == null ? cod_enf == null : enfermedad.getCod_enf().equals(cod_enf)) {        
                return enfermedad; 
            } 
        } 
        return null; 
    }
    
    public void añadirEnfermedad(Enfermedad enfermedad) {
        
        if (enfermedades == null) {
            
            enfermedades = new Enfermedad[1];
            
            enfermedades[0] = enfermedad;
        } else {
            
            Enfermedad[] temporal = new Enfermedad[enfermedades.length + 1];
            
            Matrices.clonarMatrices(enfermedades, temporal);

            temporal[temporal.length -1 ] = enfermedad;
            
            enfermedades = temporal;
        }
   
    }

    @Override
    public String toString() {
        String cadena = "";
        
        for (Enfermedad enfermedad : enfermedades) {
            cadena += enfermedad + " ";
        }
        
        return cadena;
    }

    public void setEnfermedades(Enfermedad[] enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enfermedades other = (Enfermedades) obj;
        if (!Arrays.deepEquals(this.enfermedades, other.enfermedades)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Arrays.deepHashCode(this.enfermedades);
        return hash;
    }
    
    
    
    
    
    
}
