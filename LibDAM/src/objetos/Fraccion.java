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


/**
 * Utilidades Fracciones
 * @author Hector Espert
 */
public class Fraccion {

    /**
     * @param args the command line arguments
     */
    private int numerador;
    private int denominador;
    
    /**
     *Crea un objeto fraccion. 
     */
    public Fraccion() {
        numerador = 0;
        denominador = 1;
        
    }
    
    /**
     * Crear un objeto fraccion especificando un numerador y un denominador.
     * @param num
     * @param deno
     * @throws java.lang.Exception
     */
    public Fraccion(int num, int deno) throws Exception {
        numerador = num;
        denominador = deno;
        
        comprobar(numerador, denominador);

    }
    
    private static void comprobar(int numerador, int denominador) throws Exception {
        
        if (denominador == 0) {
            throw new Exception("El valor del denominador no puede ser igual a 0") ;
        }
        
        if (numerador < 0 && denominador < 0) {
            
            numerador = Math.abs(numerador);
            
            denominador = Math.abs(denominador);
            
        }
        
        
    }
    
    /**
     * Pasa a una fraccion el valor del numerador y de el denominador.
     * @param num
     * @param deno
     * @throws java.lang.Exception
     */
    public void set(int num, int deno) throws Exception {
        numerador = num;
        this.setDenominador(deno);
        
    }
    
    /**
     *
     * @param num
     */
    public void setNumerador(int num) {
        numerador = num;    
        try {
            comprobar(numerador, denominador);
        } catch (Exception ex) {
        }
    }
    
    /**
     *
     * @param deno
     * @throws Exception
     */
    public void setDenominador(int deno) throws Exception {
            denominador = deno;
            comprobar(numerador, denominador);
  
    }
    
    /**
     *
     * @return
     */
    public int  getNumerador() {
        
        return numerador;
    }
    
    /**
     *
     * @return
     */
    public int  getDenominador() {
        
        return denominador;
    }
    
    /**
     *  Simplifica la fraccion
     */
    public void simplificar() {
       
       
       int mcd = Numeros.maximoComunDivisor(numerador, denominador);
       
       numerador = numerador / mcd;
       
       
       denominador = denominador / mcd;
       
       
   }
    

    @Override
    public String toString() {
        return String.format("%d/%d", numerador, denominador);
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fraccion other = (Fraccion) obj;
        
        this.simplificar();
        other.simplificar();
        
        if (this.numerador != other.numerador) {
            return false;
        }
        if (this.denominador != other.denominador) {
            return false;
        }
        return true;
    }

    /**
     * @deprecated
     * @param fraccion
     * @return
     */
    public Fraccion suma(Fraccion fraccion ) {
        
        if (fraccion != null) {
        
        Fraccion resultado = new Fraccion();
            try {
                resultado.setDenominador(this.denominador * fraccion.getDenominador());
            } catch (Exception ex) {
                return null;
            }
        
        resultado.setNumerador(this.numerador * fraccion.getDenominador() + this.denominador * fraccion.getNumerador() );
         
        return resultado;
        
        } else {
            
            return null;
        }
    }
    
    /**
     * @deprecated
     * @param fraccion
     * @return
     */
    public Fraccion resta(Fraccion fraccion) {
        
        if (fraccion != null) {
        
        Fraccion resultado = new Fraccion();
            try {
                resultado.setDenominador(this.denominador * fraccion.getDenominador());
            } catch (Exception ex) {
                return null;
            }
        
        resultado.setNumerador(this.numerador * fraccion.getDenominador() - this.denominador * fraccion.getNumerador() );
         
        return resultado;
        } else {
            
            return null;
        }
        
    }

    /**
     * @deprecated
     * @param fraccion
     * @return
     */
    public Fraccion multiplicacion(Fraccion fraccion) {
        
        if (fraccion != null) {
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(this.numerador * fraccion.getNumerador());
            try {
                resultado.setDenominador(this.denominador * fraccion.getDenominador());
            } catch (Exception ex) {
                return null;
            }

        return resultado;
        } else {
            
            return null;
        }
        
        
    }
    
    /**
     * @deprecated
     * @param fraccion
     * @return
     */
    public Fraccion division(Fraccion fraccion) {
        
        if (fraccion != null) {
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(this.numerador * fraccion.getDenominador());
            try {
                resultado.setDenominador(this.denominador * fraccion.getNumerador());
            } catch (Exception ex) {
                return null;
            }
         
        return resultado;
        } else {
            
            return null;
        }
        
        
    }

    
    
    
}