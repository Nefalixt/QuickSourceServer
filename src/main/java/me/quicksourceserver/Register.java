package me.quicksourceserver;

import org.json.simple.JSONObject;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
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
