import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String msgFromServer, msgFromUser;

        while (true) {
            System.out.print("Client: ");
            msgFromUser = keyboard.readLine();
            out.println(msgFromUser);

            if ("bye".equalsIgnoreCase(msgFromUser)) break;

            msgFromServer = in.readLine();
            System.out.println("Server: " + msgFromServer);

            if ("bye".equalsIgnoreCase(msgFromServer)) break;
        }

        socket.close();
    }
}