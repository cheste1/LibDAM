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
public class Libro {
    
    private int id;
    
    private String titulo;
    
    private Autores autores;
    
    private double precio;
    
    private boolean tapa_dura;

    public Libro(int id, String titulo, Autores autores, double precio, boolean tapa_dura) {
        this.id = Math.abs(id);
        this.titulo = titulo;
        this.autores = autores;
        this.precio = Math.abs(precio);
        this.tapa_dura = tapa_dura;
    }

    @Override
    public String toString() {
        return "[" + String.valueOf(id)+ "]" + titulo;
    }
    
    

    public Autores getAutores() {
        return autores;
    }
    

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTapa_dura(boolean tapa_dura) {
        this.tapa_dura = tapa_dura;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isTapa_dura() {
        return tapa_dura;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autores, other.autores)) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.tapa_dura != other.tapa_dura) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.autores);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 11 * hash + (this.tapa_dura ? 1 : 0);
        return hash;
    }

}
