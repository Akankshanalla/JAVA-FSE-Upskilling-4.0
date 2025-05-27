import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Server listening on port 12345");

        Socket client = server.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String msgFromClient, msgFromServer;

        while ((msgFromClient = in.readLine()) != null) {
            System.out.println("Client: " + msgFromClient);
            if ("bye".equalsIgnoreCase(msgFromClient)) break;

            System.out.print("Server: ");
            msgFromServer = keyboard.readLine();
            out.println(msgFromServer);

            if ("bye".equalsIgnoreCase(msgFromServer)) break;
        }

        client.close();
        server.close();
    }
}