import java.util.HashMap;

public class Nicknames {
    
    public static void main(String[] args) {
        HashMap<String, String> testHashMap = new HashMap<String, String>();
        
        testHashMap.put("matti", "mage");
        testHashMap.put("mikael", "mixu");
        testHashMap.put("arto", "arppa");
        
        System.out.println(testHashMap.get("mikael"));
    }
}