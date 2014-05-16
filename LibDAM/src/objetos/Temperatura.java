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

import utilidades.Numeros;
import utilidades.Temperaturas;

/**
 *
 * @author alumno
 */
public class Temperatura {
    
    
    
    double temperatura;
    
    
    
    public Temperatura() {
        
        this.temperatura = 0;
    }
    
    public Temperatura(double kelvin) {
        
        temperatura = kelvin;
    }
    
    
    public double getkelvin() {
        
        return this.temperatura;
      
    }

    public void setKelvin(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * Asigna un temperatura en Centigrados
     * @param temperatura
     */
    public void setCentigrados(double temperatura) {
        
        this.temperatura = Temperaturas.celsiusToKelvin(temperatura);
  
    }
    
    /**
     * Asigna  un temperatura en Fahrenheit
     * @param temperatura
     */
    public void setFahrenheit(double temperatura) {
        
      this.temperatura = Temperaturas.fahrenheitToKelvin(temperatura);  
        
        
    }
    
    
    
    public double getCentigrados() {
        
        return Temperaturas.kelvinToCelsius(temperatura);
    }
    
    public double getFahrenheit() {
        
        return Temperaturas.kelvinToFahrenheit(temperatura);
    }
    

    @Override
    public String toString() {
        
        return String.format("%.2fº K, %.2fº C, %.2f F", temperatura, this.getCentigrados(), this.getFahrenheit());
    }

    


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.temperatura) ^ (Double.doubleToLongBits(this.temperatura) >>> 32));
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
        final Temperatura other = (Temperatura) obj;
        
        double tmpother = Numeros.redondear(other.temperatura, 4);
        double tmpthis = Numeros.redondear(this.temperatura, 4);
        return tmpthis == tmpother;
    }

    

    

    

    

    

    
    
    
    
    
    
    
    
}
