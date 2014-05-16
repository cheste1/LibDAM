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
public class TablaMultiplicar {
    
    private int numero;

    public TablaMultiplicar() {
        numero = 0;
    }

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }
    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
    public String[] toStringMat() {
      String[] temporal = new String[10];
      
      
      return temporal;
    }
    
    /**
     *
     * @return
     */
    public String toStringHtml(){
        String table = "<html>"; 
        for (int i = 0; i <= 10; i++) {  
            table += String.format("%d * %d = %d<br>", i , numero, multiplicar(i)); 
        }
        table += "</html>"; 
        return table;        
    }

    @Override
    public String toString() {
        String temporal = "";
        for (int i = 0; i <= 10; i++) {  
           temporal += String.format("%d * %d = %d\n", i , numero, multiplicar(i)); 
        }
        return temporal;
    }
    
    private int multiplicar(int numero) {   
        return this.numero * numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TablaMultiplicar other = (TablaMultiplicar) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numero;
        return hash;
    }

    
    
    
    
    
    
    
    
}
