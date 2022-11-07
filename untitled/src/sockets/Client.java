package sockets;
import java.net.*;

public class Client{
    public static void main(String[] args) {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try{

            Socket kkSocket = new Socket(hostName, portNumber);

            Despachador lector = new Despachador(kkSocket, "Server");//objeto jugador

            Despachador escritor = new Despachador(kkSocket, "jugador");//objeto sincronizador


        }catch (Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
    }
}