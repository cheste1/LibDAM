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

package utilidades;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Colecciones {
    
//    /**
//     * Genera un String de una coleccion.
//     * @param c
//     * @return
//     */
//    public static String toString(Collection<?> c) {
//        String cadena = "";
//        cadena = c.stream().map((object) -> object.toString() + " ").reduce(cadena, String::concat);
//        return cadena;
//    }

    /**
     * Elimina un Objeto de una coleccion.
     * @param c
     * @param object
     */
    public static void eliminar(Collection<?> c, Object object){
        Iterator it = c.iterator(); 
        while (it.hasNext()) { 
            Object temp = it.next();
            if (temp.equals(object)) {
                it.remove();
            }
 
        }
 
    }
    
    /**
     * Devuelve un objeto de una coleccion segun un valor .
     * @param collection
     * @param number
     * @return
     * @throws java.lang.Exception
     */
    public static Object getByNumber(Collection<?> collection, int number) throws Exception {
        
        if (collection.isEmpty()) {
            throw new Exception("La coleccion esta vacia");
        } else if (number < 1 || number > collection.size()) {
            throw new Exception("El valor pedido no esta dentro del rango de objetos de la colección.");
        } else {
            Iterator iter;
            iter = collection.iterator();
            int contador = 1;
            while (iter.hasNext()) {
                if (contador == number) {
                    return iter.next();
                } else {
                    iter.next();
                    contador++;
                }
            }
            return null;
        }
    }
    
    /**
     * Borra un objeto de una coleccion segun un valor. 
     * @param collection
     * @param number
     * @return
     * @throws Exception
     */
    public static boolean removeBynumber(Collection<?> collection, int number) throws Exception {
        if (collection.isEmpty()) {
            throw new Exception("La coleccion esta vacia");
        } else if (number < 1 || number > collection.size()) {
            throw new Exception("El valor pedido no esta dentro del rango de objetos de la colección.");
        } else {
            Iterator iter;
            iter = collection.iterator();
            int contador = 1;
            while (iter.hasNext()) {
                if (contador == number) {
                    iter.next();
                iter.remove();
                return true;
                } else {
                    iter.next();
                    contador++;
                }
            }
            return false;
        }
    }
    
}
