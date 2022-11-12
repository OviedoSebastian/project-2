package characters;
import game.levels.Laberinto;
import sockets.Despachador;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Personaje{

    Laberinto lab = new Laberinto();
    int [][] laberinto = lab.obtenerLaberinto();
    public int x=0;
    public int y=0;
    private final int ancho = 30;
    private final int alto = 30;
    private final int movimiento = 30;

    public Personaje(int players){
       if(players==1) {
           x = 30;
           y = 30;
       }else if(players ==2){
                x = 60;
                y = 60;
       }
    }

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
