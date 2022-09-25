
public class PersonNode {
     
    String name;
    String number;
    PersonNode next,leftChild,rightChild;
    
    public PersonNode(){
        number = null;
        name = null;
        next = null;
    }
    public PersonNode(String name,String number){
        this.name = name;
        this.number = number;
        this.next = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    public PersonNode getNext() {
        return next;
    }
    public void setNext(PersonNode next) {
        this.next = next;
    }    
}
