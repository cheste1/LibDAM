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

package objetos.loteria;

import excepciones.PrimitivaException;

/**
 *
 * @author alumno
 */
public class Ganadora extends Primitiva{
    private int complementario;
    private int reintegro;

    public Ganadora() {
        Bombo bombo = new Bombo(50);
        complementario = bombo.sacarBola();
        Bombo bombo_reintegro = new Bombo(9);
        reintegro = bombo_reintegro.sacarBola();
    }

    public int getComplementario() {
        return complementario;
    }

    public int getReintegro() {
        return reintegro;
    }

    @Override
    public int getNumero(int numero) throws PrimitivaException {
        if (numero == 6) {
            return  complementario;
        } else if(numero == 7) {
            return reintegro;
        } else {
            return super.getNumero(numero);
        }
    }

    
    
    
    
    
}
