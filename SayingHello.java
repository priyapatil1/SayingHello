import java.io.*;

public class SayingHello {

    public static void main(String args[]) {
        System.out.print("Please enter your name:");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader inputToString = new BufferedReader(input);
        {
            try {
                String nameEntered = inputToString.readLine();
                System.out.println("Hi " + nameEntered);
            } catch (IOException err) {
                System.out.println("No name entered, try again.");
            }
        }
    }
}
