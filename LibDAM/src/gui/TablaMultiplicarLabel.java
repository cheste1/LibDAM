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

import javax.swing.JLabel;
import objetos.TablaMultiplicar;

/**
 *
 * @author alumno
 */
public class TablaMultiplicarLabel extends JLabel{

    private TablaMultiplicar tabla;
    
    
    public TablaMultiplicarLabel() {
        tabla = new TablaMultiplicar(0);
        setText(tabla.toStringHtml()); 
    }

    public TablaMultiplicarLabel(int numero) {
        tabla = new TablaMultiplicar(numero);
        setText(tabla.toStringHtml());
    }

    public void setTabla(TablaMultiplicar tabla) {
        this.tabla = tabla;
    }

    public TablaMultiplicar getTabla() {
        return tabla;
    }
    
    public void setTabla(int numero) {
        tabla = new TablaMultiplicar(numero);
        setText(tabla.toStringHtml());
    }
    
    
    
    
    
    
    
    
    
    
}
