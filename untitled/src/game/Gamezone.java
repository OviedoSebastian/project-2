package game;
import characters.Personaje;
import game.levels.Laberinto;
import gui.VentanaServer;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Gamezone extends Canvas implements KeyListener {
    Laberinto laberinto = new Laberinto();
    public int player=0;
    Personaje pj;

    public Gamezone(){
        super();
        setBackground(Color.white);
        setSize(690,390);
        addKeyListener(this);
        setFocusable(true);
        pj = new Personaje(player);
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
    public void setPlayer(int player){
        this.player = player;
    }

}
