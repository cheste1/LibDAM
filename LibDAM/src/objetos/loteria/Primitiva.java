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

package objetos.loteria;

import excepciones.PrimitivaException;
import java.util.Arrays;
import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Primitiva {
    
    private int[] primitiva;

    public Primitiva() {
        primitiva = new int[6];
        Bombo bombo = new Bombo(50);
        
        for (int i = 0; i < primitiva.length; i++) {
            primitiva[i] = bombo.sacarBola();
        }
        
    }
    
    public int getNumero(int numero) throws PrimitivaException{
        if (numero > 5 || numero < 0) {
          throw new PrimitivaException();
        } else {
            return primitiva[numero];
        }  
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Primitiva other = (Primitiva) obj;
        return Arrays.equals(this.primitiva, other.primitiva);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Arrays.hashCode(this.primitiva);
        return hash;
    }

    @Override
    public String toString() {
        return Matrices.toText(primitiva);
    }
    
    
    
    
 
}
