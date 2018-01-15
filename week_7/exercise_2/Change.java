public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString) {
        String output = null;
        
        for (int i = 0;  i < characterString.length(); i++) {
            if (this.fromCharacter == characterString.charAt(i)) {
                output = characterString.replace(this.fromCharacter, this.toCharacter);
                break;
            }
        }
        
        return output;
    }
}