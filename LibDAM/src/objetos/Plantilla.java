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
public class Plantilla extends Empleado{
    
    private double horas_extra;
    private double salario_anual;
    private double años_antiguedad;

    public Plantilla() {
    }

    public Plantilla(String cod_emple, Seguro seguro, String nombre, Direccion direccion, double horas_extra, double salario_anual, double años_antiguedad) {
        super(cod_emple, seguro, calcSalario(salario_anual), nombre, direccion);
        this.horas_extra = horas_extra;
        this.salario_anual = salario_anual;
        this.años_antiguedad = años_antiguedad;
    }

    /**
     * @return the horas_extra
     */
    public double getHoras_extra() {
        return horas_extra;
    }

    /**
     * @param horas_extra the horas_extra to set
     */
    public void setHoras_extra(double horas_extra) {
        this.horas_extra = horas_extra;
    }

    /**
     * @return the salario_anual
     */
    public double getSalario_anual() {
        return salario_anual;
    }

    /**
     * @param salario_anual the salario_anual to set
     */
    public void setSalario_anual(double salario_anual) {
        this.salario_anual = salario_anual;
        super.setSalario(calcSalario(salario_anual));
    }

    /**
     * @return the años_antiguedad
     */
    public double getAños_antiguedad() {
        return años_antiguedad;
    }

    /**
     * @param años_antiguedad the años_antiguedad to set
     */
    public void setAños_antiguedad(double años_antiguedad) {
        this.años_antiguedad = años_antiguedad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plantilla other = (Plantilla) obj;
        if (Double.doubleToLongBits(this.horas_extra) != Double.doubleToLongBits(other.horas_extra)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario_anual) != Double.doubleToLongBits(other.salario_anual)) {
            return false;
        }
        if (Double.doubleToLongBits(this.años_antiguedad) != Double.doubleToLongBits(other.años_antiguedad)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.horas_extra) ^ (Double.doubleToLongBits(this.horas_extra) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.salario_anual) ^ (Double.doubleToLongBits(this.salario_anual) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.años_antiguedad) ^ (Double.doubleToLongBits(this.años_antiguedad) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + " " +  horas_extra + " " + salario_anual + " " + años_antiguedad;
    }
    
    
    private static Nomina calcSalario(double salario_anual) {
        
        return new Nomina(salario_anual / 14.0);
 
    }
    
    
}
