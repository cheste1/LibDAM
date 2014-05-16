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
public class Proveedor extends Persona {
    
    private int cod_prov;
    private double saldo;
    private String email;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(int cod_prov, double saldo, String email, int telefono, String nombre, Direccion direccion) {
        super(nombre, direccion);
        this.cod_prov = cod_prov;
        this.saldo = saldo;
        this.email = email;
        this.telefono = telefono;
    }

    public int getCod_prov() {
        return cod_prov;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCod_prov(int cod_prov) {
        this.cod_prov = cod_prov;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
