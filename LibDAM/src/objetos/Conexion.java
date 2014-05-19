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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


/**
 *
 * @author alumno
 */
public abstract class Conexion implements Runnable {
    
    private Thread hilo;
    private Socket conexion;
    
    private DataInputStream entrada;
    private DataOutputStream salida;
    
    private String mensajesalida;
    private String mensajeentrada;

    public Conexion() {
    }

    public void setConexion(Socket conexion) {
        this.conexion = conexion;
    }

    public void setEntrada(DataInputStream entrada) {
        this.entrada = entrada;
    }

    public void setSalida(DataOutputStream salida) {
        this.salida = salida;
    }

    public DataInputStream getEntrada() {
        return entrada;
    }

    public DataOutputStream getSalida() {
        return salida;
    }

    public Socket getConexion() {
        return conexion;
    }
    
    public void start(){
        if(hilo==null){
            hilo=new Thread(this);
            hilo.start();
        }
    }
    
    @Override
    public void run() {
        
        if (conexion != null) {
//            try { 
//                
//            } catch (IOException ex) {
//            
//            }
        }
  
    }
    
    public void enviarMensaje() {
        
    }

    public void leerMensaje(){
        
    }

    public void setMensajeentrada(String mensajeentrada) {
        this.mensajeentrada = mensajeentrada;
    }

    public String getMensajeentrada() {
        return mensajeentrada;
    }

    public void setMensajesalida(String mensajesalida) {
        this.mensajesalida = mensajesalida;
    }

    public String getMensajesalida() {
        return mensajesalida;
    }
}
