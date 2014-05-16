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
public class Eventual extends Empleado{
    
    private double horas;
    private double honorarios;

    public Eventual() {
    }

    public Eventual(String cod_emple, Seguro seguro, String nombre, Direccion direccion, double horas, double honorarios) {
        super(cod_emple, seguro, calcSalario(horas, honorarios), nombre, direccion);
        this.horas = horas;
        this.honorarios = honorarios;
    }

    /**
     * @return the horas
     */
    public double getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(double horas) {
        this.horas = horas;
        super.setSalario(calcSalario(this.horas, honorarios));
    }

    /**
     * @return the honorarios
     */
    public double getHonorarios() {
        return honorarios;
    }

    /**
     * @param honorarios the honorarios to set
     */
    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
        super.setSalario(calcSalario(horas, this.honorarios));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eventual other = (Eventual) obj;
        if (Double.doubleToLongBits(this.horas) != Double.doubleToLongBits(other.horas)) {
            return false;
        }
        if (Double.doubleToLongBits(this.honorarios) != Double.doubleToLongBits(other.honorarios)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.horas) ^ (Double.doubleToLongBits(this.horas) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.honorarios) ^ (Double.doubleToLongBits(this.honorarios) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + " " + horas + " " + honorarios; 
    }
    
    private static Nomina calcSalario(double horas, double honorarios) {
        
        return new Nomina(horas * honorarios);
 
    }
 
}
