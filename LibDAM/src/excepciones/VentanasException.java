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

package excepciones;

import java.awt.Component;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class VentanasException extends Exception {
    
    private String msg;
    
    private Component componente;

    /**
     * Creates a new instance of <code>VentanasException</code>
     * @param textfield
     * @param msg
     */
    public VentanasException(JTextField textfield, String msg) {
        this.msg = msg;
        this.componente = textfield;
    }

    /**
     * Constructs an instance of <code>VentanasException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public VentanasException(String msg) {
        this.msg = msg;
    }
}
