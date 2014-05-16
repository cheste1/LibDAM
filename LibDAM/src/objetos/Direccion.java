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
public class Direccion {
    private String calle;
    private String numero;
    private String pueblo;
    private int cod_postal;

    public Direccion() {
    }
    
    public Direccion(String calle, String numero, String pueblo) {
        this.calle = calle;
        this.numero = numero;
        this.pueblo = pueblo;
        this.cod_postal = 0;
    }

    public Direccion(String calle, String numero, String pueblo, int cod_postal) {
        this.calle = calle;
        this.numero = numero;
        this.pueblo = pueblo;
        this.cod_postal = cod_postal;
    }

    public String getCalle() {
        return calle;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public String getNumero() {
        return numero;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return calle + " " + numero + " " + pueblo + " " + cod_postal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.calle);
        hash = 41 * hash + Objects.hashCode(this.numero);
        hash = 41 * hash + Objects.hashCode(this.pueblo);
        hash = 41 * hash + this.cod_postal;
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
        final Direccion other = (Direccion) obj;
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.pueblo, other.pueblo)) {
            return false;
        }
        if (this.cod_postal != other.cod_postal) {
            return false;
        }
        return true;
    }
    
    
    
}
