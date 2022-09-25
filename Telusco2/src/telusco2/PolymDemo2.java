package telusco2;

public class PolymDemo2 {
    public static void main(String[] args) {
        
        M obj = new N();    //runtime polymophism
        obj.show();
        
        obj = new K();      //Dynamic Dispatch
        obj.show();
    }
    
}

class M{
    public void show(){
        System.out.println("In M");
    }
}
class N extends M{
    public void show(){
        System.out.println("In N");
    }
}
class K extends M{
    public void show(){
        System.out.println("In K");
    }
}
