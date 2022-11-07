package characters;
import game.levels.Laberinto;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Personaje{

    Laberinto lab = new Laberinto();
    int [][] laberinto = lab.obtenerLaberinto();
    private int x=30;
    private int y=30;
    private final int ancho = 30;
    private final int alto = 30;
    private final int movimiento = 30;

    /*public Personaje(int players){
        switch (players) {
            case 1:
                x = 30;
                y = 30;
                break;
            case 2:
                x = 60;
                y = 60;
                break;
        }
    }*/

    public void paintPJ(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,ancho,alto);
    }

    public void pj_move(KeyEvent event){
        switch (event.getKeyCode()){
            case 37://izquierda
                if(laberinto[y/30][(x/30)-1] != 1){
                    x = x - movimiento;
                }
            break;
            case 38://arriba
                if(laberinto[(y/30)-1][x/30] != 1){
                    y = y - movimiento;
                }
                break;
            case 39://derecha
                if(laberinto[y/30][(x/30)+1] != 1){
                    x = x + movimiento;
                }
                break;
            case 40://abajo
                if(laberinto[(y/30)+1][(x/30)] != 1){
                    y = y + movimiento;
                }
                break;
        }

    }
}
