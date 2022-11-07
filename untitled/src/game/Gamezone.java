package game;
import characters.Personaje;
import game.levels.Laberinto;
import sockets.Server;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gamezone extends Canvas implements KeyListener {
    Laberinto laberinto = new Laberinto();
    Server contador;
    Personaje pj = new Personaje();//arreglar
    public Gamezone(){
        super();
        setBackground(Color.white);
        setSize(690,390);
        addKeyListener(this);
        setFocusable(true);
    }

    public void paint(Graphics g){
        laberinto.paintfield(g);
        pj.paintPJ(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        pj.pj_move(e);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
