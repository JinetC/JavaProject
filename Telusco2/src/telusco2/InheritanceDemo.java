package telusco2;

public class InheritanceDemo {
    
    public static void main(String[] args) {
        
        AddSubMul obj = new AddSubMul();
        obj.num1 = 5;
        obj.num2 = 4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.multi();
        System.out.println(obj.result);
    }
    
}

class Add{

    int num1,num2,result;
    public void sum(){
        
        result = num1 + num2;
    }

}

class SubAdd extends Add {          //single level Inheritance
    
    public void sub(){
        
        result = num1 - num2;
    }
}

class AddSubMul extends SubAdd{
    
    public void multi(){
        result = num1 * num2;
    }
}