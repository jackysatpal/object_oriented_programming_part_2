import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    
    private HashMap<String, String> dictionary;
    
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        
        return null;
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        String value = null;
        
        for (String string : this.dictionary.keySet()) {
            value = this.dictionary.get(string);
            list.add(string + " = " + value);
        }
        return list;
    }
}