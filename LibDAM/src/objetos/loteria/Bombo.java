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

import java.util.ArrayList;
import utilidades.Aleatorios;

/**
 *
 * @author alumno
 */
public class Bombo {
    
    private ArrayList<Integer> bolas;

    public Bombo(int bolas) {
        this.bolas = new ArrayList<>();
        for (int i = 0; i < Math.abs(bolas); i++) {
            this.bolas.add(i);
        } 
    }
    
    /**
     * Saca una bola del bombo.
     * @return
     */
    public int sacarBola() {
        int pos = Aleatorios.entre(0, bolas.size() - 1);
        Integer bola = bolas.get(pos);
        bolas.remove(pos); 
        return bola; 
    }
    
    
    
}
