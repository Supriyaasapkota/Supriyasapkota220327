
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MeroServer {
    private static void checkEvenorOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("this is even");
        }

    }

    public static void main(String[] args) {
        try{
            System.out.println("Server starting up...");
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("Waiting for client...");
            Socket socket = ss.accept();
            System.out.println("Connected with client");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            int result = dis.read();
            checkEvenorOdd(result);
            System.out.println(result);

        }catch (IOException e)
        e.printStackTrace();
    }

}

