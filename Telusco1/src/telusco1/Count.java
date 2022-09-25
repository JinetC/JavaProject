package telusco1;

public class Count {
    
    public static void main(String[] args) {
        
        A obj1 = new A(); 
        A obj2 = new A(); 
        A obj3 = new A(); 
        
        obj2.count();
        
    }
    
}

class A{
    
    static int i;
    public A(){
        i++;
    }
    
    public void count(){
     
        System.out.println(i);
    }
    
}