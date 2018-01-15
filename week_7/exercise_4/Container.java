import java.util.ArrayList;

public class Container {
    
    private int maximumWeight;
    private ArrayList<Suitcase> container;
    
    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.container = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maximumWeight) {
            this.container.add(suitcase);
        }
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }
    
    public String toString() {
        return this.container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase : this.container) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
}