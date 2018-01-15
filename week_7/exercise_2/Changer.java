import java.util.ArrayList;

public class Changer {
    
    private ArrayList<Change> changes;
    
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        String output = characterString;
        
        for (Change change : this.changes) {
            output = change.change(output);
        }
        
        return output;
    }
}