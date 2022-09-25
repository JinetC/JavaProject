package telusco2;

public class EncapDemo {
    
    public static void main(String[] args) {
    
        Emp e1 = new Emp();
        e1.setEmpId(1);
        e1.setEmpName("Jineth");
        
        Emp e2 = new Emp();
        e2.setEmpId(2);
        e2.setEmpName("Navin");
        
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
    }
}

class Emp{
    
    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
}
