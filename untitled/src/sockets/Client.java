package sockets;
import java.net.*;

public class Client{
    public static void main(String[] args) {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try{
            Socket jugadorsocket = new Socket(hostName, portNumber);

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
    }
}