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

import java.awt.Color;
import java.awt.Component;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import objetos.Fecha;
import objetos.Fraccion;
import objetos.Temperatura;

/**
 *
 * @author Hector Espert
 */
public class Ventanas {
    
    /**
     * Lee el valor de un TextField y devuelve un int.
     * 
     * @param textfield
     * @return
     * @throws java.lang.Exception
     */
    public static int TextFieldtoInt (JTextField textfield) throws Exception  {
        
        String numstring = textfield.getText();
        
        if (numstring.equalsIgnoreCase("")) {
                throw new Exception("No has introducido ningun valor") ;
            
            } else {
        
            int numero;
            
            

            try {
                numero = Integer.parseInt(numstring);
                return numero;
            } catch (NumberFormatException errordouble) { 
                try {
                       numero = (int)getDouble(numstring);
                       return numero;
                } catch (NumberFormatException errorint) {

                 throw new Exception("El valor introducido no es un número") ;

                }

            }
        }
    }
    
    /**
     *  Lee una cadena de un textfield
     * @param textfield
     * @return 
     * @throws Exception Devuelve error si la cadena esta vacia o es un numero
     */
    public static String TextFieldtoString (JTextField textfield) throws Exception  {
        
        String string = textfield.getText();
        
        try {
            
            double numero = Double.parseDouble(string);
            throw new Exception("El valor introducido es un número") ; 
        } catch (NumberFormatException e) {
            
            if (string.equalsIgnoreCase("")) {
                throw new Exception("No has introducido ningun valor") ;
            } else {
               return string; 
            }
        }
        
    }

    /**
     *  Lee un double de un textfield
     * @param textfield
     * @return
     * @throws Exception
     */
    public static double TextFieldtoDouble (JTextField textfield) throws Exception {
        
            String numstring = textfield.getText();
            
            if (numstring.equalsIgnoreCase("")) {
                throw new Exception("No has introducido ningun valor") ;
            
            } else {
                return getDouble(numstring);
            }
            
    }
       
    /**
     *  Extrae un double de un string
     * @param numstring
     * @return
     * @throws Exception
     */
    private static double getDouble (String numstring) throws Exception  {  
        double numero;
        
        try {
            numero = Double.parseDouble(numstring);
            return numero;
        } catch (NumberFormatException e) {
            throw new Exception("El valor introducido no es un número") ;
   
        }
  
    }

    /**
     * Muestra una matriz en un TextArea
     * @param matriz
     * @param textarea
     */
    public static void matrizToTextArea(int[] matriz, JTextArea textarea) {
        
        
        String cadena = "";
        
        int contador = 0;
        
        for (int numero : matriz) {
            
            cadena += Integer.toString(numero) + " ";
            
            if (contador == textarea.getColumns()) {
                
                cadena += "\n";
                contador = -1;
                
            }
            
            contador++;
            
        }
        
        textarea.setText(cadena);
    }
    
    /**
     *  Muestra un mensaje de error
     * @param component
     * @param error
     */
    public static void error (Component component, Exception error) {
              
        JOptionPane.showMessageDialog(component, error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    
    }
    
    
    /**
     *  Muestra un mensaje de error
     * @param component
     * @param mensaje
     */
    public static void error (Component component, String mensaje) {
              
        JOptionPane.showMessageDialog(component, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    
    }
    
    /**
     *  Muestra un mensaje
     * @param component
     * @param mensaje
     */
    public static void mensaje (Component component, String mensaje) {
        
        
        JOptionPane.showMessageDialog(component, mensaje, "Mensaje para el usuario", JOptionPane.PLAIN_MESSAGE);
  
    }
    
    /**
     *  Muestra un mensaje de información
     * @param component
     * @param mensaje
     */
    public static void info (Component component, String mensaje) {
        
        JOptionPane.showMessageDialog(component, mensaje, "Información para el usuario", JOptionPane.INFORMATION_MESSAGE);
        
        
    }

    /**
     *  Limpia un textfield.
     * @param textfield
     */
    public static void cleanTextFiel(JTextField textfield) {
        
        textfield.setText("");
        textfield.grabFocus();
        
    }
    
    /**
     *  Devuelve una matriz de una pareja de TextFields
     * @param numerador
     * @param denominador
     * @return
     * @throws Exception
     */
    public static Fraccion getFraccion(JTextField numerador, JTextField denominador) throws Exception {  
        Fraccion fraccion;
        int n_numerador;
        int n_denominador;
        
            n_numerador = Ventanas.TextFieldtoInt(numerador);
            n_denominador = Ventanas.TextFieldtoInt(denominador);
            fraccion = new Fraccion(n_numerador, n_denominador);
        return fraccion;
    }

    /**
     * @deprecated 
     * Extrae una fecha de varios textfields
     * @param tfdia
     * @param tfmes
     * @param tfaño
     * @return
     * @throws Exception
     */
    public static Fecha textFiedsToFecha(JTextField tfdia, JTextField tfmes, JTextField tfaño) throws Exception {
        
            int dia = TextFieldtoInt(tfdia);
            
            int mes = TextFieldtoInt(tfmes);
            
            int año = TextFieldtoInt(tfaño);
            
            if (Utilidades.comprobarFecha(dia, mes, año)) {
                return new Fecha(dia, mes , año);    
            } else {
                throw new Exception("La fecha es incorrecta");  
                
            }
    }
    
    /**
     * Extrae una temperatura de un texfield
     * @param tftemperatura
     * @return
     * @throws Exception
     */
    public static Temperatura textFieldToTemperatura(JTextField tftemperatura) throws Exception {
        
        double temperatura =  TextFieldtoDouble(tftemperatura);
        return new Temperatura(temperatura);  
    }

    public static int TextFieldtoIntNoN(JTextField textfield) throws Exception {
        
        String numstring = textfield.getText();
        
        if (numstring.equalsIgnoreCase("")) {
                throw new Exception("No has introducido ningun valor") ;
            
            } else {
        
            int numero;
            try {
                numero = Integer.parseInt(numstring);  
                if (numero < 0) {
                    throw new Exception("El valor introducido no puede ser negativo") ;
                }
                return numero;
            } catch (NumberFormatException errordouble) { 
                try {
                       numero = (int)getDouble(numstring);
                       if (numero < 0) {
                            throw new Exception("El valor introducido no puede ser negativo") ;
                        }
                       return numero;
                } catch (NumberFormatException errorint) {

                 throw new Exception("El valor introducido no es un número") ;

                }

            }
        }
        
    }
    
    /**
     * Extra el color de fondo de un radio button seleccionado perteneciente a un grupo de botones.
     * @param buttongroup
     * @return
     */
    public static Color radioGroupToColor(ButtonGroup buttongroup) {
        Color color = null;
        
        for (Enumeration<AbstractButton> buttons = buttongroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                color = button.getBackground();
            } 
        }
        
        return color;
        
    }

}
