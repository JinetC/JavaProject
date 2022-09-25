package telusco2;

public class PolymDemo1 {
    public static void main(String[] args) {
        S obj = new S();
        obj.show();
        
    }
    
}
class S{
    public void show(){
        System.out.println("Hello class s");
    }
}
class P extends S{
    public void show(){
        System.out.println("Hellow class p extend by s");
    }
}