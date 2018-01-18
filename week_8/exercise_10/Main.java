public class Main {
    
    public static void main(String[] args) {
        CivilService testCS = new CivilService();
        MilitaryService testMS = new MilitaryService(2);
        NationalService testNS = new MilitaryService(4);
        
        System.out.println(testCS);
        System.out.println(testMS);
        System.out.println(testNS);
        
        testCS.work();
        testMS.work();
        testMS.work();
        testMS.work();
        
        testNS.work();
        testNS.work();
        
        System.out.println(testCS);
        System.out.println(testMS);
        System.out.println(testNS);
    }
}