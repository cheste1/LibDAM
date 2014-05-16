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
public class Dia {
    
    
    private Fecha fecha;
    
    private Temperatura temperatura;
    
    private Lluvia lluvia;
    
    public Dia( Fecha fecha) {
        
        this.fecha = fecha;
        
        this.temperatura = null;
        
        this.lluvia = null;
    }

  

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setLluvia(Lluvia lluvia) {
        this.lluvia = lluvia;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }
    
    public boolean  hayDatosTemperatura() {
        
        if (temperatura == null) {
            
            return false;
        } else {
            return true;
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.temperatura);
        hash = 97 * hash + Objects.hashCode(this.lluvia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dia other = (Dia) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.temperatura, other.temperatura)) {
            return false;
        }
        if (!Objects.equals(this.lluvia, other.lluvia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return fecha.toString();
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    

