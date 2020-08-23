package me.quicksourceserver;

import org.json.simple.JSONObject;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AccountCreate {

    private Socket socket = null;
    private ServerSocket clientsocket = null;
    private DataInputStream datainput = null;
    String receivingFile = null; //@BurgBoi

    public void receiveRegistry(int port) {
    }

    int check;

//			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

    public AccountCreate() throws IOException {

    }

    public void makeLogin(String username, String password, AccountType accountType) {
        try {
            File file = new File("Users/", username);
            File dir = new File("Users/");

            if (!dir.exists())
                dir.mkdir();
            if (!file.exists())
                file.createNewFile();
            else {
                //return "that username already exists!" to the client
            }

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username", username);
            jsonObject.put("password", password);
            jsonObject.put("accountType", accountType.getRankType().getKey());

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(jsonObject.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}