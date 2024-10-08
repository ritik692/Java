package Client_Server_and_URL_Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",3000);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());
        output.writeInt(10);
        output.writeInt(20);
        int sum = input.readInt();
        System.out.println("Sum : " + sum);

    }
}