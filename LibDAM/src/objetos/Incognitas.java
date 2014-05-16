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

import abstractas.Incognita;
import java.util.HashSet;
import java.util.Iterator;
import utilidades.Colecciones;

/**
 *
 * @author alumno
 */
public class Incognitas {
    
    private HashSet<Incognita> incognitas;
    private Iterator iter;

    public Incognitas() {
        incognitas = new HashSet();
//        iter = incognitas.iterator();
    }
    
    
    public boolean addIncognita(Incognita incognita) {
        return incognitas.add(incognita);
    }
    
    public int getNumberIncognitas() {
        return incognitas.size();
    }
    
    public Incognita getIncognita(int number) throws Exception {
        return (Incognita) Colecciones.getByNumber(incognitas, number);
    } 
    
    public boolean removeIncognita(int number) throws Exception {
        return Colecciones.removeBynumber(incognitas, number);
    }
    
    public boolean removeIncognita(Incognita incognita) {  
        return incognitas.remove(incognita);
    }
    
    
}
