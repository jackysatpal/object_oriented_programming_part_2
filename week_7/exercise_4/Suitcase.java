import java.util.ArrayList;

public class Suitcase {
    
    private int maximumWeightLimit;
    private ArrayList<Thing> things;
    
    public Suitcase(int maximumWeightLimit) {
        this.maximumWeightLimit = maximumWeightLimit;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
               
        if (thing.getWeight() + this.totalWeight() <= this.maximumWeightLimit) {
            this.things.add(thing);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        
        for (Thing thing : this.things) {
            sum += thing.getWeight();
        }
        
        return sum;
    }
    
    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        
        if (this.things.isEmpty()) {
            return heaviest;
        } else {
            heaviest = this.things.get(0);
            
            for (Thing thing : this.things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
            
            return heaviest;
        }
    }
    
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight() + " kg)"; 
        } else {
            return this.things.size() + " things (" + this.totalWeight() + " kg)";   
        }
    }
}