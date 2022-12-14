
import java.io.File;
import java.util.Scanner;


public class MainPhoneBook {
    public static int hashnum = 10;
    
    static Scanner scanInput = new Scanner(System.in);
    public static void main(String []args) throws Exception{
        System.out.println("1. Hash Table\n2. Binary Search Tree");
        int input = scanInput.nextInt();
        if(input == 1){
            hash();
        }else{
            bst();
        }
        
    }
    public static void hash() throws Exception {
		TelephoneBook list = new TelephoneBook();			//Creates telephoneBook object
		Scanner scan = new Scanner(new File("C:/Users/ASUS/Documents/NetBeansProjects/FinalPhoneBookProject/src/input-data10.csv"));		//Find input data here
		while (scan.hasNextLine()){																			//Scans until everything has been scanned
			String str = scan.nextLine();
			String[] array = str.split(",");								//Splits the line by the commas, puts the parts into an array
			list.insert(array[0], array[1]);						//Inserts the data into the hash table as it is coming in
		}
		int input = 0;
		while (input != 5){
			System.out.println("\nMenu for Hash Table");					//This (and line below) displays all the text for the menu
			System.out.println("1. Insert Telephone Number\n2. Retrieve Telephone Number\n3. Delete Telephone Number\n4. Display Telephone Book\n5. End Program");
			System.out.print("Enter choice (1-5): ");
			input = scanInput.nextInt();									//Takes user input
			switch(input){
			
			

			case 1 :
				System.out.println("\nPlease enter your name");
				String insertName = scanInput.next();						//User enters name
				scanInput.nextLine();										//Without this line, the inputs get all screwed up. Had difficulty figuring this out.
				System.out.println("Please enter your phone number (e.g. 123-456-7890)");
				String insertNumber = scanInput.next();						//User enters phone number
				list.insert(insertName, insertNumber);		//Send's user's data to be inserted
				break;
				
				
			case 2 :
				System.out.print("\nEnter person's name: ");
				String retrievePerson = scanInput.next();					//User enters name
				
				PersonNode retrieved = list.retrieve(retrievePerson);		//Program returns the person and their information
				
				if (retrieved == null){
					System.out.println("\n" + retrievePerson + " does not exist in the telephone book"); 	//Display message if person not found
				} else {
					System.out.println(retrieved.name + "'s telephone number is: " + retrieved.number);		//Display person's phone number
				}
				break;
				
				
			case 3 :
				System.out.print("\nEnter person's name: ");
				String deletePerson = scanInput.next();
				PersonNode deleted = list.delete(deletePerson);
				if (deleted == null){
					System.out.println("\n" + deletePerson + " does not exist in the telephone book");		//Display message if person not found
				} else {
					System.out.println("Deleting: " + deleted.name + " " + deleted.number);
				}
				break;
				
				
			case 4 :
				System.out.print("\nDisplay Table");
				list.displayBook();												//Displays entire phone book
				System.out.println("");
				break;
				
				
			case 5 :
				list.writeOutput();												//Writes data to output file
				System.out.println("\nData has been written to excel file.");	//Program will end after this section completes
				break;
			}
		}
	}
    
    public static void bst() throws Exception{
		TelephoneBook bstList = new TelephoneBook();													//Creates TelephoneBook object
		Scanner scan = new Scanner(new File("C:/Users/ASUS/Documents/NetBeansProjects/FinalPhoneBookProject/src/input-data10.csv"));	//Finds input data here
		while (scan.hasNextLine()){																		//Scans until everything has been scanned
			String str = scan.nextLine();
			String[] array = str.split(",");												//Splits the line by the commas, puts the parts into an array
	        bstList.bstInsert(array[0], array[1]);								//Inserts the data into the BST as it is coming in
		}
		int input = 0;
		while (input != 5){
			System.out.println("\nMenu for Binary Search Tree");							//This (and line below) displays all the text for the menu
			System.out.println("1. Insert Telephone Number\n2. Retrieve Telephone Number\n3. Delete Telephone Number\n4. Display Telephone Book\n5. End Program");
			System.out.print("Enter choice (1-5): ");
			input = scanInput.nextInt();													//Takes user input
			switch(input){
			
			
			//Case 1: Insert
			case 1 :
				System.out.println("\nPlease enter your name");
				String insertName = scanInput.next();										//User enters name								//User enters address
				System.out.println("Please enter your phone number (e.g. 123-456-7890)");
				String insertNumber = scanInput.next();										//User enters phone number
				bstList.bstInsert(insertName, insertNumber);					//Sends user's data to be entered into phone book
				System.out.println("\nThe record has been added");
				break;
				
				
			//Case 2: Retrieve
			case 2 :
				System.out.print("\nEnter person's name: ");
				String retrievePerson = scanInput.next();									//User enters name
				PersonNode retrieved = bstList.bstRetrieve(retrievePerson);					//Returns person's information
				if (retrieved == null){
					System.out.println("\n" + retrievePerson + " does not exist in the telephone book");	//Displays message if person not found
				} else {
					System.out.println(retrieved.name + "'s name is: " + retrieved.name);				//Displays person's address
					System.out.println(retrieved.name + "'s telephone number is: " + retrieved.number);		//Displays person's phone number
				}
				break;
				
				
			//Case 3: Delete
			case 3 :
				System.out.print("\nEnter person's name: ");
				String deletePerson = scanInput.next();										//User enters name
				PersonNode deleted = bstList.bstDelete(deletePerson);						//Record is deleted, and person's info is returned
				if (deleted == null){
					System.out.println("\n" + deletePerson + " does not exist in the telephone book");		//Message if person is not found
				} else {
					System.out.println("Deleting: " + deleted.name + " " + deleted.number);	//Lets user know person was deleted
				}
				break;
				
				
			//Case 4: Display
			case 4 :
				System.out.print("\nDisplay Table");
				bstList.bstDisplayBook();											//Display's entire phone book
				System.out.println("");
				break;
				
				
			//Case 5: End Program
			case 5 :
				bstList.bstWriteOutput();											//Writes entire phone book to output file
				System.out.println("\nData has been written to excel file.");		//Programs ends after this has been completed
				break;
			}
		}
	}
    
    
}
