import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Register {

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    java.io.FileReader input = null;
    java.io.FileWriter output = null;

    int check;

//			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

    public Register() throws IOException {

    }

    public void makeLogin(String username, String password) {
        try {
            Fil

        } catch (IOException e) {
            System.out.println("");
        }
    }


    public void checkPassword() throws java.io.IOException {
        try {

        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();

            }
        }
    }
}
