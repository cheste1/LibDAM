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

/**
 *
 * @author Hector Espert
 */
public class Temperaturas {

    /**
     *  Convierte Celsius a Fahrenheit
     * @param celsius
     * @return
     */
    public static double celsiusToFahrenheit(double celsius) {
        celsius = (9.0/5.0) * celsius + 32.0;
        return celsius; 
    }
    
    /**
     * Convierte Fahrenheit a celsius
     * @param fahrenheit
     * @return
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        fahrenheit = (fahrenheit -32.0) * (5.0 / 9.0);
        return fahrenheit; 
    }
    
    /**
     *  Convierte Celsius a Kelvin
     * @param celsius
     * @return
     */
    public static double celsiusToKelvin(double celsius) {
        celsius += 273.15;
        return celsius;
    }
    
    /**
     *  Convierte Kelvin a Celsius
     * @param kelvin
     * @return
     */
    public static double kelvinToCelsius(double kelvin) {
        kelvin -= 273.15;
        return kelvin;
    }
    
    /**
     *  Convierte Fahrenheit a Kelvin
     * @param fahrenheit
     * @return
     */
    public static double fahrenheitToKelvin(double fahrenheit) {
        fahrenheit = (fahrenheit + 459.67) * (5.0 / 9.0);
        return fahrenheit;
    }
    
    /**
     *  Convierte Kelvin a Fahrenheit
     * @param kelvin
     * @return
     */
    public static double kelvinToFahrenheit(double kelvin) {
        kelvin = (kelvin * (9.0/5.0)) - 459.67;
        return kelvin;
    }
    
}
