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

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Enfermedad {
    
    private String cod_enf;
    private String nombre;
    private String diagnostico;

    public Enfermedad() {
    }

    public Enfermedad(String cod_enf, String nombre, String diagnostico) {
        this.cod_enf = cod_enf;
        this.nombre = nombre;
        this.diagnostico = diagnostico;
    }
    
    

    public Enfermedad(String cod_enf) {
        this.cod_enf = cod_enf;
    }

    public String getCod_enf() {
        return cod_enf;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return "[" +  cod_enf + "]" + nombre + ":" + diagnostico;
    }

    public void setCod_enf(String cod_enf) {
        this.cod_enf = cod_enf;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cod_enf);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.diagnostico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enfermedad other = (Enfermedad) obj;
        if (!Objects.equals(this.cod_enf, other.cod_enf)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.diagnostico, other.diagnostico)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    
    
    
    
    
}
