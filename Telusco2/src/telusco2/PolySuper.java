package telusco2;

public class PolySuper {
    public static void main(String[] args) {
        
        F obj = new F(5);
    }
    
}
class E{
    public E(){
        System.out.println("in const E");
    }
    public E(int i){
        System.out.println("In const E para");
    }
    
}

class F extends E{
    public F(){
        System.out.println("In const F");
    }
    public F(int i){
        super(i);                           //this is a super key word as a method
        System.out.println("In const F para");
    }
    
}
