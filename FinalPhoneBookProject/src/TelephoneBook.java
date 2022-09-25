

public class TelephoneBook {
    PersonList object = new PersonList();
    BinarySearchTree tree = new BinarySearchTree();
    
    public TelephoneBook(){
    }
    
    public void insert(String name,String number){
        int index = Math.abs(number.hashCode())% MainPhoneBook.hashnum;
        
        if (object.get(number, index) == null){
            PersonNode entry = new PersonNode(name,number);
            object.add(entry, index);
        }
        else
        {															//If entry exists....
            PersonNode updatePerson = object.get(name, index);
            updatePerson.setNumber(number);										//Update the phone number
	}
    }
    public PersonNode retrieve(String number){
		int index = Math.abs(number.hashCode()) % MainPhoneBook.hashnum;			//Hashes the name
		return object.get(number, index);										//Searches the appropriate linked list and returns PersonNode with matching name
    }
    public PersonNode delete(String number){
		int index = Math.abs(number.hashCode()) % MainPhoneBook.hashnum;			//Hashes the name
		return object.remove(number, index);									//Deletes PersonNode object from appropriate linked list, returns their info
    }
    public void displayBook(){
		for (int index = 0; index <= (MainPhoneBook.hashnum - 1); ++index){		//Traverses all 7 linked lists
			System.out.print("\nTelephoneBook[" + index + "] => ");
			object.display(index);											//Calls to display method to display entire contents of one linked list (at a time)
		}
    }
    public void writeOutput() throws Exception{
        object.print();
    }
    
    public void bstInsert(String name, String number){
		int index = Math.abs(number.hashCode()) % MainPhoneBook.hashnum;			//Hashes the name
		
		if (tree.get(name, index) == null){									//If new entry....
			PersonNode entry = new PersonNode(name, number);		//Creates PersonNode object for this person's info
			tree.add(entry, index);											//Adds PersonNode object to BST
			
		} else {															//If entry exists....
			PersonNode updatePerson = tree.get(name, index);				//Retrieve PersonNode object of existing entry								//Update their address
			updatePerson.setNumber(number);									//Update their phone number
		}	
	}
    public PersonNode bstRetrieve(String number){
		int index = Math.abs(number.hashCode()) % MainPhoneBook.hashnum;			//Hashes the name
		return tree.get(number, index);										//Searches BST and retrieves the person's info
	}
    public PersonNode bstDelete(String number){
		int index = Math.abs(number.hashCode()) % MainPhoneBook.hashnum;			//Hashes the name
		return tree.get(number, index);										//Searches BST and retrieves the person's info
	}
    public void bstDisplayBook(){
        tree.display(tree.root);
    }
    public void bstWriteOutput() throws Exception{
        tree.print(tree.root);
    }
    
}
