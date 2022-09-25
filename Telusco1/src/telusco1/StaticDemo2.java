package telusco1;


public class StaticDemo2 {
    
    static String s = "";
    static{
        s= "Hello World";
    }
    
    public static void main(String[] args) {
        
        System.out.println("The value of s: " +s); 
    }
    
    
}
