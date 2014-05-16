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

import abstractas.Figura;
import objetos.Fraccion;
import objetos.Matriz;
import objetos.Punto;
import static utilidades.Matrices.getColumnas;

/**
 *
 * @author Hector Espert Pardo
 */
public class Calculadora extends Numeros {

    /**
     *  Suma dos objetos de clase Fraccion
     * @param primera
     * @param segunda
     * @return
     */
    public static Fraccion sumar ( Fraccion primera, Fraccion segunda) {
        
        if (primera != null && segunda !=null) {
        
        Fraccion resultado = new Fraccion();
            try {
                resultado.setDenominador(primera.getDenominador() * segunda.getDenominador());
            } catch (Exception ex) {
                return null;
            }
        
        resultado.setNumerador(primera.getNumerador() * segunda.getDenominador() + primera.getDenominador() * segunda.getNumerador() );
         
        return resultado;
        
        } else {
            
            return null;
        }
        
    }

    /**
     *  Resta dos fracciones
     * @param primera
     * @param segunda
     * @return
     */
    public static Fraccion restar ( Fraccion primera, Fraccion segunda) {
        
        if (segunda != null && primera != null) {
        
        Fraccion resultado = new Fraccion();
            try {
                resultado.setDenominador(primera.getDenominador() * segunda.getDenominador());
            } catch (Exception ex) {
                return null;
            }
        
            resultado.setNumerador(primera.getNumerador() * segunda.getDenominador() - primera.getDenominador() * segunda.getNumerador() );
         
            return resultado;
        } else {
            
            return null;
        }  
        
    }
    
    /**
     *  Multiplica dos fracciones
     * @param primera
     * @param segunda
     * @return
     */
    public static Fraccion multiplicacion ( Fraccion primera, Fraccion segunda) {
        
        if (primera != null && segunda != null) {
        Fraccion resultado = new Fraccion();
        
            resultado.setNumerador(primera.getNumerador() * segunda.getNumerador());
            try {
                resultado.setDenominador(primera.getDenominador() * segunda.getDenominador());
            } catch (Exception ex) {
                return null;
            }
            return resultado;
        } else {
            
            return null;
        }
  
    }
    
    /**
     *  Divide dos fracciones
     * @param primera
     * @param segunda
     * @return
     */
    public static Fraccion division ( Fraccion primera, Fraccion segunda) {
        
        if (primera != null && segunda != null) {
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(primera.getNumerador() * segunda.getDenominador());
            try {
                resultado.setDenominador(primera.getDenominador() * segunda.getNumerador());
            } catch (Exception ex) {
                return null;
            }
         
        return resultado;
        } else {
            
            return null;
        }
 
    }
    
    /**
     *  Multiplicacion matrizes
     * @param matriza
     * @param matrizb
     * @return
     */
    public static int [][] multiplicacion(int[][] matriza, int[][] matrizb) {
        
        int[][] matriz = null;
        
        
        //Sacar tamaños
        
        int columnasmatriza = matriza.length;
        
        int columnasmatrizb = matrizb.length;
                
        int filasmatriza = getColumnas(matriza);
        
        int filasmatrizb = getColumnas(matrizb);
        
        //Mirar si se pueden multiplicar
        
        if (filasmatriza == columnasmatrizb) {
            
            
            matriz = new int[columnasmatriza][filasmatrizb]; 
            
            
            
            for (int i = 0; i < columnasmatriza; i++) {
                
                for (int j = 0; j < filasmatrizb; j++) {
                    
                    int suma = 0;
                    
                    for (int k = 0; k < filasmatriza; k++) {
                        
                        suma += matriza[i][k] * matrizb[k][j];
                        
                    }

                    matriz[i][j] = suma;
       
                }
            }

        }
        
        return matriz;
    }
    
    /**
     * Suma dos objetos Matriz
     * @param mata
     * @param matb
     * @return
     * @throws Exception
     */
    public static Matriz suma(Matriz mata, Matriz matb) throws Exception {
        
            if (mata.isNull() || matb.isNull()) {
                throw new Exception("Una de las matrices es nula");
            } else if (mata.getFilas() != matb.getFilas() || mata.getColumnas() != matb.getColumnas()) {
                
                throw new Exception("Las dimensiones de las matrices son iguales");
                
            } else {
                
                Matriz resultado = new Matriz(mata.getFilas(), mata.getColumnas());
                
                for (int i = 0; i < mata.getFilas(); i++) {
                    for (int j = 0; j < mata.getColumnas(); j++) {
                        
                        int numero = mata.getValor(i, j) + matb.getValor(i, j);
                        resultado.setValor(numero, i, j);
                        
                    }
                }
                
                
                
                return resultado;
            }

    }
    
    /**
     * Resta 2 objetos Matriz
     * @param mata
     * @param matb
     * @return
     * @throws Exception
     */
    public static Matriz resta(Matriz mata, Matriz matb) throws Exception {
            
            if (mata.isNull() || matb.isNull()) {
                throw new Exception("Una de las matrices es nula");
            } else if (mata.getFilas() != matb.getFilas() || mata.getColumnas() != matb.getColumnas()) {
                
                throw new Exception("Las dimensiones de las matrices son iguales");
                
            } else {
                
                Matriz resultado = new Matriz(mata.getFilas(), mata.getColumnas());
                
                for (int i = 0; i < mata.getFilas(); i++) {
                    for (int j = 0; j < mata.getColumnas(); j++) {
                        
                        int numero = mata.getValor(i, j) - matb.getValor(i, j);
                        resultado.setValor(numero, i, j);
                        
                    }
                }
                
                
                
                return resultado;
            }

    }
    
    /**
     * Calcula la distancia entre dos puntos
     * @param primero
     * @param segundo
     * @return
     */
    public static double getDistancia(Punto primero, Punto segundo){
        return Math.sqrt(Math.pow(Math.abs(segundo.getX() - primero.getX()), 2) + Math.pow(Math.abs(segundo.getY() - primero.getY()), 2));
    }
    
    /**
     * Calcula la distancia entre dos figuras.
     * @param primera
     * @param segunda
     * @return
     */
    public static double getDistancia(Figura primera, Figura segunda){
        return getDistancia(primera.getCentro(), segunda.getCentro());
    }
    
    /**
     * Calcula el area de un circulo.
     * @param radio
     * @return
     */
    public static double areaCirculo (double radio) {
        return Math.PI * radio * radio;
    }
    
    /**
     * Calcula el perimetro de un circulo.
     * @param radio
     * @return
     */
    public static double perimetroCirculo (double radio) {
        return 2 * Math.PI * radio;
    }
    
    
    public static double areaCuadrado (double lado) {
        return Math.pow(lado, 2);
    }
    
    public static double perimetroCuadrado (double lado) {
        return 4 * lado;
    }
    
    
    
    
    
    
    
}
