import java.util.Scanner;

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = new Scanner(System.in);
        this.dictionary = new Dictionary();
    }
    
    public void start() {
        System.out.println("Statement:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        
        while (true) {
            System.out.print("\nStatement: ");
            String command = this.reader.nextLine();
            
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String key = this.reader.nextLine();
        
        System.out.print("Translation: ");
        String value = this.reader.nextLine();
        
        this.dictionary.add(key, value);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String key = this.reader.nextLine();
        
        System.out.println("Translation: " + this.dictionary.translate(key));
    }
}