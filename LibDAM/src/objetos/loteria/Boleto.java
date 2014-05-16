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

import excepciones.ReintegroException;

/**
 *
 * @author alumno
 */
public class Boleto extends Primitiva{
    
    private int idadmin;
    
    private int serialnumber;
    
    private int reintegro;
    
    private static int checkReintegro(int reintegro) throws ReintegroException{
        if (reintegro < 0 || reintegro > 9) {
            throw new ReintegroException();
        } else {
            return reintegro;
        }  
    }

    public Boleto() {
    }

    public Boleto(int idadmin, int serialnumber, int reintegro) {
        this.idadmin = idadmin;
        this.serialnumber = serialnumber;
        this.reintegro = reintegro;
    }

    @Override
    public String toString() {
        return String.format("Administracion: %d, S/N: %d, Primitiva: %s, Reintegro: %d",idadmin, serialnumber, super.toString(), reintegro);
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public int getReintegro() {
        return reintegro;
    }
    
    
    
    
    
    

    
    
    
    
    
    
    
    
}
