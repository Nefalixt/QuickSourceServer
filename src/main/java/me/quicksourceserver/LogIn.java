package me.quicksourceserver;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class LogIn {
	
    public boolean checkPassword(String username, String password) throws java.io.IOException {
        File file = new File("Users/", username);
        if (file.exists()) {
            try {
                try (FileReader fileReader = new FileReader(file)) {
                    JSONParser jsonParser = new JSONParser();
                    JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
                    String passwordFromJson = (String) jsonObject.get("password");
                    if (password.equals(passwordFromJson)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            //return to the client "that user does not exist!"
            return false;
        }
        return false;
    }
}

