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
 * @author alumno
 */
public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * 
     * @param lado
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return Calculadora.areaCuadrado(lado);
    }

    @Override
    public double calculaPerimetro() {
        return Calculadora.perimetroCuadrado(lado);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuadrado other = (Cuadrado) obj;
        return this.lado == other.lado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.lado;
        return hash;
    }

    @Override
    public String toString() {
        return String.format("Cuadrado: x=%d, y=%d, L=%d.", super.getCentro().getX(), super.getCentro().getY(), lado);
    }
    
    
    
    
    
}
