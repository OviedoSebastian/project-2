package sockets;
import gui.VentanaLaberinto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;

public class Despachador extends Thread {

    private PrintWriter out;
    private BufferedReader in;
    private String tipo = "";
    private Socket socket;
    public ArrayList<Despachador> escritores;
    private String nickname;
    public int players;

    public Despachador(Socket socket, String tipo) {
        this.socket = socket;
        this.players = players;

        try {
            this.in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            this.out = new PrintWriter(socket.getOutputStream(), true);
            this.tipo = tipo;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    public void run() {
        try {
            if (tipo.equals("jugador")) {
                leer();

            } else {
                escribir();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private void leer() throws IOException {
        VentanaLaberinto v = new VentanaLaberinto();
        v.setVisible(true);
    }

    private void escribir() throws IOException {


    }
    public void send(String inputLine){

    }


}