import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUtils {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public ServerUtils(int port) {
        java.io.FileInputStream fileinput = null;
        java.io.BufferedInputStream bufferedinput = null;
        java.io.OutputStream output = null;
        java.net.ServerSocket serversocket = null;
        java.net.Socket socket = null;
        try {
            while (true) {
                System.out.println("connecting to server");
            }
            try {
                socket = serversocket.accept();
                System.out.println("connected to server");


            } finally {
                if (bufferedinput != null & output != null & socket != null) {
                    bufferedinput.close();
                    output.close();
                    socket.close();
                }
            }
        } finally {
            if (serversocket != null) serversocket.close();
        }
    }
}
