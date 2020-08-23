public class LogIn {
    
    java.io.FileReader input = null;
    java.io.FileWriter output = null;

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
}
