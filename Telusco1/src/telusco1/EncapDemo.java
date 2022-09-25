package telusco1;

public class EncapDemo {

    public static void main(String[] args) {
        B obj =  new B();
        obj.setI(5);
        System.out.println(obj.getI());
        
    }
    
}

class B{
    private int i;
    
    public void setI(int j){
        i=j;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }
    
}