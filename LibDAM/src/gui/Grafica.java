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

package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import utilidades.Matrices;

/**
 *
 * @author alumno
 */
public class Grafica extends javax.swing.JPanel {
    
    private int[] datos;
    
    private int separation;
    
    
    public Grafica() {  
        datos = null;
    }
    
    
    public void setDatos(int[] datos) {
        
        this.datos = datos;
        this.separation = 5;
 
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        if (datos != null) {
            crearGrafica(g);
        }
    
    }
    
    
    private void crearGrafica(Graphics g) {
          Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.RED);
            
           
          //Posiciones Grafica  
            
        double xMax = getBounds().width;
        double yMax = getBounds().height;
        int posY0 = (int) yMax - separation;
        
        int valor_menor = Matrices.SacarMenor(datos);
        
        if (valor_menor < 0) {
            
            posY0 += valor_menor;
            
        }
        
        
        double tram = xMax / (datos.length + 1);
            
        
        for (int i = 0; i < datos.length; i++) {
            int x1 = (int) ((i * tram) + (tram / 2));
            int y1 = (int) (posY0 - datos[i] * 2);
            int ample = (int) tram - 1;
            int alt = datos[i] * 2;
            int des = y1 - 2;
            if (datos[i] < 0) {
                y1 = posY0;
                alt = -datos[i] * 2;
                des = posY0 + alt + 12;
            }
            g2.fillRect(x1, y1, ample, alt);
            
            g2.drawString("" + datos[i], (int) (x1 + (tram / 2)), des);
        }

    }
    
}
