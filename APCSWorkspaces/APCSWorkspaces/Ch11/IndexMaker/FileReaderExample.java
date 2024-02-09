import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\mjn20\\APCS\\APCSWorkspaces\\APCSWorkspaces\\ch11\\IndexMaker\\fish.txt"; // Assuming
                                                                                                                // fish.txt
                                                                                                                // is in
                                                                                                                // the
                                                                                                                // same
                                                                                                                // directory
                                                                                                                // as
                                                                                                                // your
                                                                                                                // Java
                                                                                                                // program

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
