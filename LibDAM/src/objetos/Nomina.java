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

/**
 *
 * @author alumno
 */
public class Nomina {
    
    private double nomina;

    public Nomina() {
        
        nomina = 0.0;
    }

    public Nomina(double nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return String.format("%.2f", nomina);
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nomina other = (Nomina) obj;
        if (Double.doubleToLongBits(this.nomina) != Double.doubleToLongBits(other.nomina)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.nomina) ^ (Double.doubleToLongBits(this.nomina) >>> 32));
        return hash;
    }
    
    
    
    
}
