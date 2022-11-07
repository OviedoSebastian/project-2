package sockets;
import gui.VentanaServer;

import javax.swing.*;
import java.net.*;
import java.util.ArrayList;

public class Server{



    public static void main(String[] args) {

        int portNumber = Integer.parseInt(args[0]);
        ArrayList <Despachador> escritores = new ArrayList<>();
        VentanaServer v = new VentanaServer();
        v.setVisible(true);
        int players=0;

        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);

            while(true) {
                Socket clientSocket = serverSocket.accept();
                players++;
                System.out.println("prueba");

                Despachador lector = new Despachador(clientSocket, "jugador");
                lector.start();


                Despachador escritor = new Despachador(clientSocket, "escribir");
                escritores.add(escritor);
                escritor.start();

            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }


}
