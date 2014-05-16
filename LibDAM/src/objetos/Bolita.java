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

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author alumno
 */
public class Bolita extends JLabel {

    //Velocidad
    private int vel = 0;

    //Factor perdida energia rebote
    private double perdida = 0.10;

    //Contador Rebotes
    private int rebotes = 0;

    //Posiciones bolita
    private int posx;
    private int posy;

    //Tamaño Bolita
    private int tamañox = 25;
    private int tamañoy = 25;

    //Limites movimiento
    private int maxx = 240;
    private int maxy = 120;

    private int minx = 0;
    private int miny = 0;

    //Direcciones
    private boolean derecha = true;
    private boolean abajo = true;

    public Bolita() {
        setBounds(posx, posy, tamañox, tamañoy);

        setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolita.png")));

    }

    public Bolita(int velocidad) {

        setVel(velocidad);
        setBounds(posx, posy, tamañox, tamañoy);

        setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolita.png")));

        Random aleatorio = new Random();

        derecha = aleatorio.nextBoolean();
        abajo = aleatorio.nextBoolean();

    }

    public Bolita(int x, int y) {
        posx = x;
        posy = y;

        setBounds(posx, posy, tamañox, tamañoy);

        setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolita.png")));

    }

    public boolean mover() {

        if (vel > 0) {

            //Cambiar direccion
            if (derecha == true) {
                posx += vel;
            } else {
                posx -= vel;
            }

            if (abajo == true) {
                posy += vel;
            } else {
                posy -= vel;
            }

            setLocation(posx, posy);

            if (posx >= maxx) {
                derecha = false;
                Rebote();

            }

            if (posx <= minx) {
                derecha = true;
                Rebote();
            }

            if (posy >= maxy) {
                abajo = false;
                Rebote();
            }

            if (posy <= miny) {
                abajo = true;
                Rebote();
            }
            return true;
        }
        return false;
    }

    public void setPos(int x, int y) {
        posx = x;
        posy = y;
    }

    public int getposX() {
        return posx;
    }

    public int getposY() {
        return posy;
    }

    public void setLimit(int width, int height) {
        minx = 0;
        miny = 0;
        maxx = width - tamañox;
        maxy = height - tamañoy;

    }

    public int getMaxLimitX() {

        return maxx;
    }

    public int getMaxLimitY() {

        return maxy;
    }

    @Override
    public int getHeight() {

        return tamañoy;
    }

    @Override
    public int getWidth() {

        return tamañox;
    }

    public void setVel(int velocidad) {
        vel = velocidad;

    }

    public void Rebote() {

        if (rebotes * perdida >= 1) {
            vel--;
            rebotes = 0;
        } else {
            rebotes++;
        }
    }

    public void paso(int x, int y, int width, int height) {

        int bolax = getposX();
        int bolay = getposY();
        int bolawidth = getWidth();
        int bolaheight = getHeight();

        //Primera esquina
        if ((bolax >= x && bolax <= x + width) && (bolay >= y && bolay <= y + height)) {

            derecha = !derecha;
            abajo = !abajo;
            Rebote();
        }

        //Segunda esquina
        if ((bolax + width >= x && bolax + width <= x + width) && (bolay >= y && bolay <= y + height)) {

            derecha = !derecha;
            abajo = !abajo;
            Rebote();
        }

        //Tercera esquina
        if ((bolax >= x && bolax <= x + width) && (bolay + bolaheight >= y && bolay + bolaheight <= y + height)) {

            derecha = !derecha;
            abajo = !abajo;
            Rebote();
        }

        //Cuarta esquina
        if ((bolax + width >= x && bolax + width <= x + width) && (bolay + bolaheight >= y && bolay + bolaheight <= y + height)) {

            derecha = !derecha;
            abajo = !abajo;
            Rebote();
        }

    }

    /**
     *
     * @param bola
     * @param x
     * @param y
     */
    public void quitar(Bolita bola, int x, int y) {

    }

}
