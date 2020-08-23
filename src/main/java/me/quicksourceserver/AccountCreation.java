package me.quicksourceserver;

public class AccountCreation {
    public void signUp(String username, String password) {
        try {
            java.io.File account = new java.io.File("D:/" + username);
            try {
                if (account.createNewFile()) {
                    System.out.println("Created new file");
                } else System.out.println("D:/" + username + "already exists.");
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } catch {

        }
    }
}
