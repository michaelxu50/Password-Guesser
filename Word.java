import java.util.*;
import java.io.*;

//Intelligent class that uses words to guess the password. Level 1 security.
class WordAttempt {
    public static void main(String args[]) {
        try {
            FileReader fin = new FileReader("Names.txt");
            Scanner src = new Scanner(fin);
            String password = "John12!";
            for(int x=0; x<1000; x++) {
                System.out.println(fin);
            }

        }
        catch (IOException e) {
            System.out.println("Fix it");
        }
    }
}