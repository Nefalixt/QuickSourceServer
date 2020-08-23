package me.quicksourceserver;

class Main {
	public static void main(String args[]) {
		ServerUtils server = new ServerUtils(5000);
		try {
			Register test = new Register();
			test.copyFile();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}

