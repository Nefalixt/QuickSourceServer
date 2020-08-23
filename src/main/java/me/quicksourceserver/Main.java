package me.quicksourceserver;

class Main {
    public static void main(String args[]) {
        ServerUtils server = new ServerUtils(5000);
        try {
            AccountCreate test = new AccountCreate();
            test.copyFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

