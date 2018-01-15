import java.util.Scanner;

public class Reader {
    
    private Scanner userInput;
    
    public Reader() {
        this.userInput = new Scanner(System.in);
    }
    
    public String readString() {
        return this.userInput.nextLine();
    }
    
    public int readInteger() {
        return Integer.parseInt(this.userInput.nextLine());
    }
}