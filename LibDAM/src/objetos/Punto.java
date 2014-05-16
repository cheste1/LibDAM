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
public class Punto {
    
    private int x , y;

    /**
     * Genera un punto con los valores por defecto.
     */
    public Punto() {      
        this(0, 0);
    }

    /**
     * Genera un punto.
     * @param x
     * @param y
     */
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Devuelve el valor de x
     * @return
     */
    public int getX () {      
        return x;
    }
    
    /**
     * Devuelve el valor de y
     * @return
     */
    public int getY () {     
        return y;
    }
    
    /**
     * Cambia el valor de la x
     * @param x
     */
    public void setX (int x) {
        this.x = x;      
    }
    
    /**
     * Cambia el valor de la y
     * @param y
     */
    public void setY (int y) {
        this.y = y;      
    }
    
    /**
     * Cambia la posicion del punto.
     * @param x
     * @param y
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;       
    }
    
    /**
     * Devuelve una cadena con la posicion del punto.
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%d, %d", x, y);
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto other = (Punto) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    
    
    



    
    
}

