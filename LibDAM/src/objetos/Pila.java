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

import excepciones.PilaLlenaException;
import excepciones.PilaVaciaException;
import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Pila {
    
    private int[] pila;
    
    private int cima;

    public Pila() {
        pila = new int[100];
        cima = 0;   
    }
    
    public void mete(int numero) throws Exception {
        if (cima > 99) {
            throw new PilaLlenaException();
        } else {
            pila[cima] = numero;
            cima++;
        }
    }
    
    public boolean estaLlena(){
        return cima > 99;
    }
    
    public int saca() throws Exception {
        if (cima <= 0) {
            throw new PilaVaciaException();
        } else {
            cima--;
            return pila[cima];
        }  
    }
    
    public boolean estaVacia() {
        return cima <= 0;
    }

    @Override
    public String toString() {
        return String.format("I %d, P %s", cima, Matrices.toText(pila));
    }
    
    
    
    
}
