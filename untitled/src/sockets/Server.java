package sockets;
import gui.VentanaServer;
import java.net.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Server{


    public static void main(String[] args) {
        int numerojugadores=0;
        AtomicInteger levelchoose = new AtomicInteger();
        int portNumber = Integer.parseInt(args[0]);

        VentanaServer v = new VentanaServer();
        v.setVisible(true);

        v.inicar.addActionListener(ActionEvent -> {
            levelchoose.set((int) v.niveles.getSelectedItem());//selecciona el nivel para los jugadores

        });
        int players=0;
        //hacer que el canvas cliente entregue la posicion de su jugador y luego actualizarlo
        try {
            ServerSocket serverSocket = new ServerSocket(portNumber);

            while(true) {
                System.out.println("esperando...");
                Socket clientSocket = serverSocket.accept();
                numerojugadores++;
                Despachador lector = new Despachador(clientSocket, "jugador", numerojugadores);
                lector.start();
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
