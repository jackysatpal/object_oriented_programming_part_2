public class Calculator {
    
    private Reader userReader;
    private int commands;
    
    public Calculator() {
        this.commands = 0;
        this.userReader = new Reader();
    }
    
    public void start() {
        while (true) {
            String command = askForCommand();
            
            if (command.equals("end")) {
                break;
            }
            
            checkForCommand(command);
        }
        
        statistics();
    }
    
    private String askForCommand() {
        System.out.print("command: ");
        
        return userReader.readString();
    }
    
    private void checkForCommand(String command) {
        if (command.equals("sum")) {
            sum();
            this.commands++;
        } else if (command.equals("difference")) {
            difference();
            this.commands++;
        } else if (command.equals("product")) {
            product();
            this.commands++;
        } 
    }
    
    private void sum() {
        int firstNumber = userInput("value1");
        int secondNumber = userInput("value2");
        int sum = firstNumber + secondNumber;
        
        System.out.println("sum of the values " + sum);
    }
    
    private void difference() {
        int firstNumber = userInput("value1");
        int secondNumber = userInput("value2");
        int difference = firstNumber - secondNumber;
        
        System.out.println("difference of the values " + difference);
    }
    
    private void product() {
        int firstNumber = userInput("value1");
        int secondNumber = userInput("value2");
        int product = firstNumber * secondNumber;
        
        System.out.println("product of the values " + product); 
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.commands);
    }
    
    private int userInput(String text) {
        System.out.print(text + ": ");
        
        return userReader.readInteger();
    }
}