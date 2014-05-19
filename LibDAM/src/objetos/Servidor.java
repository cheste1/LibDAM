/*
 * Copyright (C) 2014 alumno
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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alumno
 */
public class Servidor extends Conexion{
    
    
    private ServerSocket server;
    private int puerto;

    public Servidor(int puerto) throws IOException {
        this.puerto = puerto;
        
        server = new ServerSocket(puerto);
    }

    @Override
    public void run() {
        
        while(server != null) {
            
            try {
                super.setConexion(server.accept());
                Socket cliente = super.getConexion();
                if (cliente != null) {
                    super.setEntrada(new DataInputStream(cliente.getInputStream()));
                    super.setSalida(new DataOutputStream(cliente.getOutputStream()));
                    while(true) {
                        if (super.getMensajesalida().isEmpty()) {
                            
                        } else {
                            super.getSalida().writeUTF(super.getMensajesalida());
                        }
                    }
                }
            } catch (IOException ex) {
            } 
        } 
    }
    
    
    

     
    
    
    
    
    
}
