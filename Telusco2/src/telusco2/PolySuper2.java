package telusco2;

public class PolySuper2 {

    public static void main(String[] args) {

        H obj = new H();
        obj.show();
    }

}

class W {

    int i = 5;
}

class H extends W {
    
    int i = 4;
    public void show(){
        System.out.println(super.i);
    }

}
