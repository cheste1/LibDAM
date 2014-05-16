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

import objetos.Dia;

/**
 *
 * @author Hector Espert
 */
public class Matrices {

    /**
     *  Extrae el numero mayor de una matriz de enteros
     * @param matriz
     * @return
     */  
    public static int SacarMayor(int[] matriz) {
        
        int mayor = matriz[0];
        
        for (int numero : matriz) {
            if (numero > mayor) {
                
                mayor = numero;
            }     
        }
        return mayor;
    }
    
    /**
     * Extrae el valor menor de una matriz de enteros
     * @param matriz
     * @return
     */
    public static int SacarMenor(int[] matriz) {
        
        int menor = matriz[0];
        
        for (int numero : matriz) {
            if (numero < menor) {
                
                menor = numero;
            }     
        }
        return menor;
    }
    
    /**
     * Extrae el numero mayor de una matriz de dobles
     * @param matriz
     * @return
     */
    public static double SacarMayor(double[] matriz) {
        
        double mayor = 0;
        
        for (double numero : matriz) {
            if (numero > mayor) {
                
                mayor = numero;
            }     
        }
        return mayor;
    }
    
    /**
     *
     * @param matriz
     * @return
     */
    public static double SacarMenor(double[] matriz) {
        
        double menor = 0;
        
        for (double numero : matriz) {
            if (numero < menor) {
                
                menor = numero;
            }     
        }
        return menor;
    }
    
    public static int contadorPares(int[] matriz) {
        
        int pares = 0;
        
        for (int numero : matriz) {
         
            if (Numeros.esPar(numero)) {
                pares++;
            }
            
        }   
        return pares;
    }
    
    public static int contadorImpares(int[] matriz) {
        
        int impares = 0;
        
        for (int numero : matriz) {
         
            if (!Numeros.esPar(numero)) {
                impares++;
            }
            
        }   
        return impares;
    }
    
    /**
     * Convierte los valores de una matriz de enteros en pares o impares.
     * @param matriz
     * @param pares True pasa a pares, false a impares
     * @return Devuelve una matriz de enteros
     */
    
    public static int[] convertir (int[] matriz, boolean pares) {
        
        int[] matrizconvertidos = new int[matriz.length]; 
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            
            int numero = matriz[i];
            
            if (pares) {
                
                if (!Numeros.esPar(numero)) {
                
                    if(numero + 1 > 99) {
                        
                        matrizconvertidos[i] = numero - 1;
                    } else {
                        
                        matrizconvertidos[i] = numero + 1;
                    }
                    
                    
                }  else {
                    
                    matrizconvertidos[i] = numero;
                }
            } else {
                
                if (Numeros.esPar(numero)) {
                
                    if(numero + 1 > 99) {
                        matrizconvertidos[i] = numero - 1;
                        
                    } else {
                        matrizconvertidos[i] = numero + 1;
                        
                    }
                    
                    
                } else {
                    
                    matrizconvertidos[i] = numero;
                }
                
            }
            
            
        }
        return matrizconvertidos;
    }
    
    /**
     *  Elimina los duplicados de una matriz de enteros
     * @param matriz
     * @return Devuelve una matriz de enteros
     */
    
    public static int[] eliminarDuplicados (int[] matriz) {
        
        int[] matrizsnoduplicados;
        
        
        int numeros = 0;
        
        for (int valor : matriz) {
            
            int repeticiones = 0;
            
            for (int numero : matriz) {
                
                if (numero == valor) {
                    
                    repeticiones++;
                }        
            }
            
            if (repeticiones == 1) {
                
                numeros++;
            }
            
        }
        
        matrizsnoduplicados = new int[numeros];
        
        int contador = 0;
        
        for (int valor : matriz) {
            
            int repeticiones = 0;
            
            for (int numero : matriz) {
                
                if (numero == valor) {
                    
                    repeticiones++;
                }        
            }
            
            if (repeticiones == 1) {
                
                matrizsnoduplicados[contador] = valor;
                    
                contador++;
                
            }
            
        }
        
        
 
        return matrizsnoduplicados;
    }
    
    /**
     * Convierte una matriz en una cadena
     * @param matriz
     * @return
     */
    public static String toText (String[] matriz) {
        
        String cadena = "";
        
        for (String palabra : matriz) {
            
            cadena += palabra + " ";
            
        }
   
        return cadena;
    }
    
    /**
     * Devuelve un String de una matriz de objetos.
     * @param matriz
     * @return
     */
    public static String toText (Object[] matriz) {
        String cadena = "";
        for (Object palabra : matriz) { 
            cadena += palabra + " ";  
        }
        return cadena;
    }
    
    
    public static String toText (char[] matriz) {
        
        String cadena = "";
        
        for (char letra : matriz) {
            
            cadena += String.valueOf(letra);
            
        }
   
        return cadena;
    }

    /**
     * Convierte una matriz en una cadena
     * @param matriz
     * @return
     */
    public static String toText (int[] matriz) {
        
        String cadena = "";
        
        for (int numero : matriz) {
            
            cadena += Integer.toString(numero) + " ";
            
        }
   
        return cadena;
    }
    
    /**
     * Convierte una matriz en una cadena
     * @param matriz
     * @return
     */
    public static String toText (double[] matriz) {
        
        String cadena = "";
        
        for (double numero : matriz) {
            
            cadena += Double.toString(numero) + " ";
            
        }
   
        return cadena;
    }

    /**
     *
     * @param matriz
     * @return
     */
    public static String toText (int[][] matriz) {
        
        String cadena = "";
        try {
            for (int[] matriz1 : matriz) {
            
                for (int columna = 0; columna < matriz1.length; columna++) {
                cadena += String.format("%2d ", matriz1[columna]);
                }
                cadena += "\n";
            
            }
        } catch (NullPointerException e) {
            cadena = "NULL";
        }
   
        return cadena;
    }

    /**
     * Suma los valores de una matriz
     * @param matriz
     * @return
     */
    public static int  suma (int[] matriz) {
        
       int suma = 0;
       
       for (int numero : matriz) {
            
            suma += numero;
            
        }
       
        return suma;
    }

    /**
     * Transpone una matriz multiple 
     * @param matriz
     */
    public static void trasponerMultiple(int[][] matriz) {
        for (int fila = 1; fila < matriz.length; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                int temp = matriz[fila][columna];
                matriz[fila][columna] = matriz[columna][fila];
                matriz[columna][fila] = temp;
            }
        }
    }
    
    /**
     *
     * @param matriz
     * @return
     */
    public static boolean isSymmetric (int[][] matriz) {
        
        boolean symmetric = true;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                
                if (matriz[i][j] != matriz[j][i]) {
                    
                    return false;
                }
            }
            
        }
      
        return symmetric;
    }
    
    
    public static int[][] getSymmetric (int num) {
        
        int[][] matriz = new int[num][num];
        
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j <= i; j++) {
                
                matriz[i][j] = Aleatorios.entre(0, 100);
                matriz[j][i] = matriz[i][j];
            }
            
        }    
        return matriz;
    }

    /**
     * @deprecated 
     * @param matriz
     * @param min
     * @param max
     */
    public static void llenarAleatorios (int[][] matriz, int min , int max) {
        
        for (int[] minimatriz : matriz) {
            for (int j = 0; j < minimatriz.length; j++) {
                
                minimatriz[j] = Aleatorios.entre(min, max);
                
            }
        }      
        
    }

    /**
     *  Cuenta el numero de filas de una matriz de dos dimensiones.
     * @param matriz
     * @return
     */
    public static int getColumnas (int[][] matriz) {
        
        int[] minimatriz = matriz[0];
        
        return minimatriz.length;
        
    }

    /**
     * @deprecated 
     *  Multiplicacion matrizes
     * @param matriza
     * @param matrizb
     * @return
     */
    public static int [][] producto(int[][] matriza, int[][] matrizb) {
        
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
    
    
    public static int[] filtarNumeros(String[] texto){
        
        int numeros = 0;
        
        for (int i = 0; i < texto.length; i++) {
            
            try {
               int tmp = Integer.parseInt(texto[i]);
               numeros++;
            } catch (Exception e) {
                
            }  
        }
        
        int[] resultado = new int[numeros];
        
        int contador = 0;
        
        for (int i = 0; i < texto.length; i++) {
            
            try {
               int tmp = Integer.parseInt(texto[i]);
               resultado[contador] = tmp;
               contador++;
            } catch (Exception e) {
                
            }  
        }
        return resultado;
    }
    
    
    public static void clonarDias(Dia[] dias_a, Dia[] dias_b) {  
        clonarMatrices(dias_a, dias_b);
    }
        
    
    
    public static void clonarMatrices(Object[] objetos_a, Object[] objetos_b) {
        if (objetos_a.length < objetos_b.length) {
            System.arraycopy(objetos_a, 0, objetos_b, 0, objetos_a.length);   
        } else {
            System.arraycopy(objetos_a, 0, objetos_b, 0, objetos_b.length); 
   
        } 
    }
        

  
}



