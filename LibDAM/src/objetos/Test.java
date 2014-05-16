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

import excepciones.ValoresIncorrectosException;
/**
 *
 * @author alumno
 */
public class Test extends Nota{
    
    private int preguntas;
    private int correctas;
    private int resto_fallos;
    

    public Test() {
        preguntas = 0;
        correctas = 0;
        resto_fallos = -1;
    }

    public Test(int preguntas )  {
        this.preguntas = preguntas;
        
    }

    public Test(int preguntas, int correctas, int resto_fallos) throws Exception { 
        super.setNota(calcNota(preguntas, correctas, resto_fallos));
        this.correctas = correctas;
        this.preguntas = preguntas;
        this.resto_fallos = resto_fallos;
    }
    
    public Test(int preguntas, int correctas) throws Exception {
        this.resto_fallos = -1;
        super.setNota(calcNota(preguntas, correctas, this.resto_fallos));
        this.correctas = correctas;
        this.preguntas = preguntas;
    }
    
    /**
     * Pone la nota segun los resultados de un examen tipo test.
     * @param preguntas Preguntas del examen tipo test.
     * @param correctas Preguntas respondidas correctamente.
     * @param resto_fallos Numero de fallos que restan una correcta, -1 si no restan los fallos.
     * @throws java.lang.Exception
     */
    public void setNota(int preguntas, int correctas, int resto_fallos) throws Exception {
        super.setNota(calcNota(preguntas, correctas, resto_fallos));
    }
    
    /**
     * Pone la nota segun los resultados de un examen tipo test.
     * @param preguntas
     * @param correctas
     * @throws Exception
     */
    public void setNota(int preguntas, int correctas) throws Exception {
        super.setNota(calcNota(preguntas, correctas, -1));
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }

    public void setPreguntas(int preguntas) {
        this.preguntas = preguntas;
    }

    public void setResto_fallos(int resto_fallos) {
        this.resto_fallos = resto_fallos;
    }
    
    

    public int getCorrectas() {
        return correctas;
    }

    public int getPreguntas() {
        return preguntas;
    }

    public int getResto_fallos() {
        return resto_fallos;
    }
    
    

    @Override
    public double getNota() {
        return super.getNota() * 10;
    }
    
    public int getPorcentaje() { 
        return 10 * (int)super.getNota();
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Test other = (Test) obj;
        if (this.preguntas != other.preguntas) {
            return false;
        }
        if (this.correctas != other.correctas) {
            return false;
        }
        if (this.resto_fallos != other.resto_fallos) {
            return false;
        }
        return true;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.preguntas;
        hash = 71 * hash + this.correctas;
        hash = 71 * hash + this.resto_fallos;
        return hash;
    }

    
    
    private double calcNota(int preguntas, int correctas, int resto_fallos) throws Exception {
        if (correctas > preguntas || correctas < 0) {
            throw new ValoresIncorrectosException();
        } else {
            int fallos = preguntas - correctas;
            if (resto_fallos > 0) {
                correctas -= fallos / resto_fallos;
            }
            return correctas * 10.0 / preguntas ;
        }
    }

    @Override
    public String toString() {
        return String.format("Preguntas:%d, Restan:%d, Correctas:%d, Porcentaje:%d, Nota:%s", preguntas, resto_fallos, correctas, getPorcentaje(), getNotaAlfabetica());
    }
    
    
 
}
