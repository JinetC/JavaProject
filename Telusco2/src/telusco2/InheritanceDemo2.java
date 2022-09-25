package telusco2;

public class InheritanceDemo2 {
    
    public static void main(String[] args) {
        
       A obj = new B(); 
    }
    
}

class A{
    
    public A(){
        
        System.out.println("In A Const");
    }
    public A(int i){
        
        System.out.println("In A Const int");
    }
}



class B extends A{
    
    public B(){
        System.out.println("In B Const");
    }
    public B(int i){
        System.out.println("In B Const int");
    }
    
}