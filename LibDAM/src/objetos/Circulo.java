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

import abstractas.Figura;
import utilidades.Calculadora;

/**
 *
 * @author Hector Espert Pardo
 */

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double getDiametro() {    
        return 2 * radio;
    }

    @Override
    public double calculaArea() {
        return Calculadora.areaCirculo(radio);
    }

    @Override
    public double calculaPerimetro() {
        return Calculadora.perimetroCirculo(radio);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circulo other = (Circulo) obj;
        return Double.doubleToLongBits(this.radio) == Double.doubleToLongBits(other.radio);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.radio) ^ (Double.doubleToLongBits(this.radio) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return String.format("Circulo: x=%d, y=%d, R=%.2f.", super.getCentro().getX(), super.getCentro().getY(), radio);
    }
    
    

    
    
    


}



