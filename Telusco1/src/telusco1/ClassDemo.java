package telusco1;

class Cal{

    int num1;
    int num2;
    int result;
    
    public void perform(){
    
        result = num1+num2;
    }
    
}

public class ClassDemo {
    
    public static void main(String[] args) {
     
        Cal obj = new Cal();
        
        obj.num1=3;
        obj.num2=5;
        
        obj.perform();
        
        System.out.println(obj.result);
    }
}
