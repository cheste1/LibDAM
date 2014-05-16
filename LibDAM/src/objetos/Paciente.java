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

/**
 *
 * @author alumno
 */
public class Paciente extends Persona{

    private Enfermedades enfermedades;
    private int telefono;
    private Fecha fecha;

    public Paciente() {
    }
    
    

    /**
     *
     * @param enfermedades
     * @param telefono
     * @param fecha
     * @param nombre
     * @param direccion
     */
    public Paciente(Enfermedades enfermedades, int telefono, Fecha fecha, String nombre, Direccion direccion) {
        super(nombre, direccion);
        this.enfermedades = enfermedades;
        this.telefono = telefono;
        this.fecha = fecha;
    }
    
    

    

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @param enfermedad
     */
    public void setEnfermedades(Enfermedades enfermedad) {
        this.enfermedades = enfermedad;
    }

    /**
     *
     * @return
     */
    public Enfermedades getEnfermedades() {
        return enfermedades;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + " " + enfermedades + " " + telefono; 
    }
    
    public String getDiagnostico(){
        
        String diagnostico = "Paciente: ";
        diagnostico += super.getNombre() + "\n";
        
        diagnostico += "Direccion: " + super.getDireccion().toString() + "\n";
        
        diagnostico += "Telefono: " + telefono + "\n";
        
        diagnostico += "Diagnostico: " + enfermedades + "\n";
        
        return diagnostico;
    }
    
    
    
    
    
    
}
