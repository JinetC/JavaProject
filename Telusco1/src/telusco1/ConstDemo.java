package telusco1;

public class ConstDemo {
    
    public static void main(String[] args) {
        
        Abc obj = new Abc(5,5.5);
        
        
    }
    
}

class Abc{
    
    public Abc(){                                   //its called method overloading  
        System.out.println("In Abc");
    }
    public Abc(int i){
        
        System.out.println("In Abc Const");
    }
    
     public Abc(int i,double d){
        
        System.out.println("In Abc Const double");
    }
    
}
