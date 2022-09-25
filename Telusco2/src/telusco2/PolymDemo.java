package telusco2;

public class PolymDemo {
    
    public static void main(String[] args) {
        
        J obj = new J();
        obj.show(4);
    }
    
}

class J{
    
    public void show(){
        System.out.println("Hello");
    }
    public void show(int i){
        System.out.println("Hi");
    }
}
