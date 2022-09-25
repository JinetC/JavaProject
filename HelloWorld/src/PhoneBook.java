
import java.util.HashMap;
import java.util.Hashtable;

public class People {

String Name;
Integer Phone;
  
People(int Phone,String Name ){
this.Phone=Phone;
this.Name=Name;
}
public String getName() {
return Name;
}
public void setName(String name) {
Name = name;
}
public int getPhone() {
return Phone;
}
public void setPhone(int phone) {
Phone = phone;
}
  
}

//Then create the Phone book class, which is going to use the above People class as value and phone number as the key in the HashMap entries.



public class PhoneBook {
  
HashMap<Integer,People> phonebook=new HashMap<>();
  
  
HashMap<Integer,People> delete_phonebook=new HashMap<>(); //For restoring the deleted entries
PhoneBook(){
  
// Adding sample data
phonebook.put(57371,new People(57371,"Jack"));
phonebook.put(57431,new People(57431,"John"));
phonebook.put(57577,new People(57577,"Ronny"));
phonebook.put(57583,new People(57583,"Johnny"));
phonebook.put(51577,new People(51577,"Samuel"));
phonebook.put(24177,new People(24177,"Nathan"));
  
}
  
public void add(Integer num,People p ){
phonebook.put(num,new People(num,"Ronny"));
}
  
public void save(Integer num, People p){
phonebook.put(num, p);
}
  
//Delete by number
public void delete(Integer num){
//Storing the entry first in delete_phonebook
People temp=this.find(num);
delete_phonebook.put(num, temp);
phonebook.remove(num);
}
  
// Delete by Name
  
public void delete(String name){
People temp=this.find(name); // Searching by name in the below mthod
Integer delPhone=temp.getPhone();
delete(delPhone); //Calling the above delete method for removal
}
  
  
//Different types of find method, this one based on phone number as input key
public People find(Integer num){
return phonebook.get(num);
}
  
//Find mrthod based on Name
  
  
public People find(String name){
  
  
  
  
for(java.util.Map.Entry<Integer, People> entry : phonebook.entrySet()){
if(entry.getValue().getName().equals(name)){
return entry.getValue();
}
}
  
return null;
}
  
public void changeName(Integer num,String newName){
People temp=this.find(num);
temp.setName(newName);
  
  
phonebook.remove(num); // Removing the old entry
phonebook.put(num,temp); //Saving the new entry with updated Name
}
  
public void changeNumber(Integer newnum,String name){
People temp=this.find(name);
Integer oldNum=temp.getPhone();
temp.setPhone(newnum);
  
phonebook.remove(oldNum); // Removing the old entry
phonebook.put(newnum,temp);
}
  
public void restore(String name){
    delete_phonebook.entrySet().stream().filter((entry) -> (entry.getValue().getName().equals(name))).map((entry) -> entry.getValue().getPhone()).map((delnum) -> delete_phonebook.get(delnum)).forEachOrdered((temp) -> {
        Integer res_num=temp.getPhone();
        phonebook.put(res_num, temp);
    });
  
}

}

//Basic HashTable format example that I would like to use:

public class PhoneBook{

   public static void main(String args[]) {
      // Create a hash map
      Hashtable b = new Hashtable();
      names;
      String gg;

      name.put("Name", new Double(0004.34));
      name.put("Name", new Double(100.002));
      name.put("Name", new Double(1008.00));

      // Show all anme in hash table.
      names = balance.keys();
      
      while(names.hasMoreElements()) {
         gg = (String) names.nextElement();
         System.out.println(gg + ": " + name.get(gg));
      }        
      System.out.println();
      
   }

    class name {

        private static String get(String gg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void put(String name, Double aDouble) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public name() {
        }
    }

    class balance {

        public balance() {
        }
    }
}
