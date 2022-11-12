package sockets;
import game.Gamezone;
import gui.VentanaLaberinto;
import gui.VentanaServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;

public class Despachador extends Thread {

    VentanaLaberinto ventanaLab;
    VentanaServer VentanaS;
    Gamezone canvas;
    private String tipo = "";
    private Socket socket;
    public ArrayList<Despachador> escritores;
    private String nickname;
    public int players;

    public Despachador(Socket socket, String tipo, int players) {
        this.socket = socket;
        this.players = players;

        try {
            this.tipo = tipo;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    public void run() {
        try {
            if (tipo.equals("jugador")) {
                inicarjuego();

            } else {
                sincronizartableros();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private void inicarjuego() throws IOException {
        ventanaLab= new VentanaLaberinto(players);
        ventanaLab.setVisible(true);
    }

    private void sincronizartableros() throws IOException {

    }
}