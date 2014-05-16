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

import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Libros {
    
    private Libro[] libros;

    public Libros() {
        
        libros = null;
    }
    
    public void añadirLibro(Libro libro) {
        
        if (libros == null) {
            
            libros = new Libro[1];
            
            libros[0] = libro;
        } else {
            
            Libro[] temporal = new Libro[libros.length + 1];
            
            Matrices.clonarMatrices(libros, temporal);

            temporal[temporal.length -1 ] = libro;
            
            libros = temporal;
        }
   
    }
    
    private void clonarLibros(Libro[] libros_a, Libro[] libros_b) {
        
        Matrices.clonarMatrices(libros_a, libros_b);
        
    }

    public Libro[] getLibros() {
        return libros;
    }
    
    public String getListado() {      
        if (getNumeroLibros() == 0) {   
            return "No hay libros";
        } else {
            
            String listado = "";
            
            for (Libro libro : libros) {
                
                listado += String.format("* [%d] %s\n%s \n", libro.getId(), libro.getTitulo(), libro.getAutores().toString());
            }
            return listado;
        }
        
 
    }
    
    public String getListado(Boolean tapa) {      
        if (getNumeroLibros() == 0) {   
            return "No hay libros";
        } else {
            
            String listado = "";
            
            for (Libro libro : libros) {
                
                if (libro.isTapa_dura() == tapa) {
                   listado += String.format("* [%d] %s\n%s \n", libro.getId(), libro.getTitulo(), libro.getAutores().toString()); 
                }
                
                
            }
            return listado;
        }
        
 
    }
    
    public int[] getIDs() {
        
        int[] ids = new int[getNumeroLibros()];
        
        for (int i = 0; i < getNumeroLibros(); i++) {
            
            ids[i] = libros[i].getId();
        }
        return ids;
    }
    
    
    
    
    public int getNumeroLibros() {  
        if (libros == null) {
            return 0;
        } else {
            
            return libros.length;
        }
    }
    
    public boolean isLibro(int id) {
        
        id = Math.abs(id);
        
        if (libros == null) {
            return false;
        } else {
          for (Libro libro : libros) {
            
            if (libro.getId() == id) {
                return true;
            }
            
            }
        
         return false;  
            
        }
        
    }
    
    
    
    
}
