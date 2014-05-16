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
public class Empleado extends Persona{
    
    private String cod_emple;
    private Seguro seguro;
    private Nomina salario;

    public Empleado() {
    }

    public Empleado(String cod_emple, Seguro seguro, Nomina salario, String nombre, Direccion direccion) {
        super(nombre, direccion);
        this.cod_emple = cod_emple;
        this.seguro = seguro;
        this.salario = salario;
    }

    public String getCod_emple() {
        return cod_emple;
    }

    public Nomina getSalario() {
        return salario;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setCod_emple(String cod_emple) {
        this.cod_emple = cod_emple;
    }

    public void setSalario(Nomina salario) {
        this.salario = salario;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cod_emple);
        hash = 29 * hash + Objects.hashCode(this.seguro);
        hash = 29 * hash + Objects.hashCode(this.salario);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.cod_emple, other.cod_emple)) {
            return false;
        }
        if (!Objects.equals(this.seguro, other.seguro)) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " " + cod_emple + " " + seguro + " " + salario;
    }
    
}
