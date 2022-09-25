
class DemoWork1 {
    public static void main(String args[])
    {
       // & 11      1
       // & 10      0 
       // | 10      1
       // | 00      0 
        
        int a = 25;//11001
        int b = 15;//01111
                   //01001
        int c = a & b;
        int d = a | b;
        
        System.out.println(c);
        System.out.println(d);
        
        int x = a << 2;
        System.out.println(x);
        
    }   
}
