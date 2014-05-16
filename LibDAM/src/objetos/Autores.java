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
public class Autores {
    
    private Autor[] autores;

    public Autores() {
        autores = null;
    }
    
    public void añadirAutor(Autor autor) {
        
        if (autores == null) {
            
            autores = new Autor[1];
            
            autores[0] = autor;
        } else {
            
            Autor[] temporal = new Autor[autores.length + 1];
            
            Matrices.clonarMatrices(autores, temporal);

            temporal[temporal.length -1 ] = autor;
            
            autores = temporal;
        }
   
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String nom_autores = "";
         
        if (autores == null || numeroAutores() == 0) {
            
            return "No hay autores";
        } else  {
            
            for (Autor autor : autores) {
                
                nom_autores += String.format("-%s %s\n", autor.getNombre(), autor.getNacionalidad());
            }

        }
        
        
        return nom_autores;
    }
    
    public int numeroAutores() {
        
        if (autores == null) {
             return 0;
        } else {
            
            return autores.length;
        }
        
        
    }
    
    public Autor getAutor(int numero) throws Exception {
        
        if (numero >= numeroAutores()) {
            throw new Exception("El numero de autor es incorrecto");
        } else { 
            return autores[numero];
        }

    }
    
    
    
    
}
