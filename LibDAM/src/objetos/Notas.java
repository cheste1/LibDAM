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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Notas {
    
    private List<Nota> notas;

    public Notas() {
        notas = new ArrayList<>();
    }

    public void addNota(Test test) {
         notas.add(test);
    }
    
    public int getNumber(){
        return notas.size();
    }
    
    public Nota getNota(int position){   
        return notas.get(position);
    }
    
    public String getList(){
        String lista = "";
        
        for (Nota nota : notas) {
                lista += nota.toString() + "\n";
        }
        return lista;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notas other = (Notas) obj;
        if (!Objects.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.notas);
        return hash;
    }
    
    
    
    
    
}
