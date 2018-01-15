import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        
        TextUserInterface testUI = new TextUserInterface(reader, dictionary);
        testUI.start();
    }
}