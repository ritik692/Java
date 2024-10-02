package Client_Server_and_URL_Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3000);
        Socket socket = ss.accept();
        System.out.println("Connection has been established between server and client!!");

        try{
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream((socket.getInputStream()));

            int a = input.readInt();
            int b = input.readInt();
            int result = a+b;
            output.writeInt(result);
            socket.close();
            ss.close();
        } catch (SocketException e) {
            System.out.println("Socket is closed!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
