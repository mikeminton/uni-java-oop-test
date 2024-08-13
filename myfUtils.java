import java.io.IOException;

public class myfUtils {

    // A simple method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // A method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
     
    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("/bin/bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            // Handle exceptions or use a fallback like printing new lines
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
