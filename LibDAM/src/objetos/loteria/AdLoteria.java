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
public class AdLoteria {
    
    private int id;
    
    private ArrayList<Boleto> boletos;

    public AdLoteria(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setBoletos(ArrayList<Boleto> boletos) {
        this.boletos = boletos;
    }

    public Boleto getBoleto() {
        Boleto nuevo = new Boleto();
        
        nuevo.setIdadmin(id);
        nuevo.setReintegro(Aleatorios.entre(0, 9));
        
        if (boletos.isEmpty()) {
            nuevo.setSerialnumber(1);
        } else {
            nuevo.setSerialnumber(boletos.get(boletos.size() - 1).getSerialnumber() + 1);
        }
        
        return nuevo;
    }
    
    
    
    
    
    
    
    
}
