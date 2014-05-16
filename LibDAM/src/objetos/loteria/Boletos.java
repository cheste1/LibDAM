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

package objetos.loteria;

import excepciones.PrimitivaException;
import java.util.ArrayList;
import utilidades.Aleatorios;

/**
 *
 * @author alumno
 */
public class Boletos {
    
    private ArrayList<Boleto> boletos;
    private ArrayList<AdLoteria> administraciones;

    public Boletos() {
        boletos = new ArrayList<>();
    }

    public void setAdministraciones(ArrayList<AdLoteria> administraciones) {
        this.administraciones = administraciones;
    }
    

    public void generar() {
        for (int i = 1; i <= 100000; i++) {
            AdLoteria labruja = administraciones.get(Aleatorios.entre(1, administraciones.size()));
            labruja.setBoletos(boletos);
            boolean add = boletos.add(labruja.getBoleto()); 
        }
    }
    
    public ArrayList<Boleto> boletosByAciertos(Ganadora ganadora, int aciertos){
        ArrayList<Boleto> boletosaciertos = new ArrayList<>(); 
        
        switch (aciertos) {
            
            case 8: //Reintegro
                for (Boleto boleto : boletos) {
                    if (boleto.getReintegro() == ganadora.getReintegro()) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
            case 7: // 5 + complementario
                for (Boleto boleto : boletos) {
                    if (getAciertosBoleto(ganadora, boleto) == 5 && comprobarComplementario(ganadora, boleto) == true) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
                
            case 6:
                for (Boleto boleto : boletos) {
                    if (getAciertosBoleto(ganadora, boleto) == 6) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
            case 5:
                for (Boleto boleto : boletos) {
                    if (getAciertosBoleto(ganadora, boleto) == 5) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
                
            case 4:
                for (Boleto boleto : boletos) {
                    if (getAciertosBoleto(ganadora, boleto) == 4) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
                
            case 3:
                for (Boleto boleto : boletos) {
                    if (getAciertosBoleto(ganadora, boleto) == 3) {
                        boletosaciertos.add(boleto);
                    }
                }
                break;
                    
        }
        return boletosaciertos;
    }
    
    private int getAciertosBoleto(Ganadora ganadora, Boleto boleto) {
        int aciertos = 0;
        
        for (int i = 0; i < 6; i++) {
            try {
                int numero = ganadora.getNumero(i);
                for (int j = 0; j < 6; j++) {
                    try {
                        if (numero == boleto.getNumero(j)) {
                            aciertos++;
                        }
                    } catch (PrimitivaException ex) {
                
                    }  
                }
            } catch (PrimitivaException ex) {
              
            }
        }
        //System.out.println(String.format("Aciertos: %d, Boleto: %s", aciertos, boleto));
        return aciertos;
    }
    
    private boolean comprobarComplementario(Ganadora ganadora, Boleto boleto) {
        boolean complementario = false;
                
        for (int i = 0; i < 6; i++) {
            try {
                if (boleto.getNumero(i) == ganadora.getComplementario()) {
                    complementario = true;
                }
            } catch (PrimitivaException ex) {
            }
        }
       return complementario; 
    }
 
    
}
