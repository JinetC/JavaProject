package telusco2;

//fina --> variable,method,class
public class FinalDemo {

    public static void main(String[] args) {
        
        OP obj = new OP();
        obj.show();
        
        
        /*     final int i ;
        i=6;
        //i=7;
        System.out.println(i);
         */
    }

}

class PO {

    public void show() {
        System.out.println("In PO show");
    }
}

class OP extends PO {

    public void show(){
        System.out.println("In OP show");
    }

}
