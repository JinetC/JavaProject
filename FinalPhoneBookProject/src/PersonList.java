
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class PersonList {
    PersonNode[] array = new PersonNode[MainPhoneBook.hashnum];
    
    public PersonList(){
    }
        public void add(PersonNode entry,int index){
            if (array[index] == null){
                array[index] = entry;
            }
            else{
                PersonNode firstNode = array[index];
                entry.setNext(firstNode);
                array[index] = entry;
            }
        }
        public PersonNode get(String name, int index){
		if (array[index] == null){										//If linked list is empty, return null
			return null;
		}
		else
		{
		PersonNode entry = array[index];								//Get first entry in list
		while (entry != null && !(entry.getName().equals(name))){
			entry = entry.getNext();									//Traverse down the list until "null" or matching name
		}
		if (entry == null){
			return null;												//If entry doesn't exist, return null
		}
		else
		{
			return entry;												//If entry does exist, return its PersonNode object
		}
		}
	}
        public PersonNode remove(String name, int index){
		if (array[index] != null){										//If linked list is not empty....
			PersonNode prev = null;											//Keeps track of previous entry
			PersonNode entry = array[index];								//Gets first entry in list
			while (entry.getNext() != null && !(entry.getName().equals(name))){
				prev = entry;												//Traverses the list. Keeps track of previous entry
				entry = entry.getNext();
			}
			if (entry.getName().equals(name)){								//If found....
				if (prev == null){											//If it's the first entry....
					array[index] = entry.getNext();						//Second entry becomes first entry (DELETE!)
				} else {													//If it's not the first entry....
					prev.setNext(entry.getNext());							//Connect previous entry to next entry (DELETE!)
				}
			} else {
				return null;
			}
			return entry;
		}
		return null;
	}
        public void display(int index){											//Displays contents of one entire linked list
		PersonNode npointer = array[index];								//Gets first node in the list
		while(npointer != null){											//Traverses list until it hits null
			System.out.print(npointer.name + ", " + npointer.number + " => ");	//Displays current info
			npointer = npointer.getNext();									//Goes to next in list
			}
		System.out.print("null");
		}
        public void print()throws IOException{
            FileWriter writer = new FileWriter("C:/Users/ASUS/Documents/NetBeansProjects/FinalPhoneBookProject/src/output-file.csv");
            BufferedWriter bwriter = new BufferedWriter(writer);
            
            for (int index = 0; index <= (MainPhoneBook.hashnum - 1); ++index){		//Traverses all 9 linked lists in the table
			PersonNode npointer = array[index];							//Gets first node in the list
			while(npointer != null){										//Traverses list until it hits null
				bwriter.write(npointer.name + "," + npointer.number + "\n");	//Writes info to buffer
				npointer = npointer.getNext();								//Goes to next in list
			}
                        bwriter.flush();
            }
        }
        
        
    }
    
