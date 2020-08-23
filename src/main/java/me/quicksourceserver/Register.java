package me.quicksourceserver;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register {

	public Register() throws IOException {

	}

	public void createUserFile(String username, String password, AccountType accountType) {
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
