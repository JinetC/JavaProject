import java.util.Scanner;
public class HashTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Hashtable ht=new Hashtable();
		String num,name,add;
		String s;
		char n;
		System.out.println("Welcome to the telephone number inquiry system!");
		System.out.println("Enter"+1+ ": Input");
		System.out.println("Input"+2+": Find");
		System.out.println("Input"+3+": Delete");
		System.out.println("Input"+4+": exit the system.");
		do {
			
			s=in.next();
			n=s.charAt(0);
			if(n!='1'&&n!='2'&&n!='3'&&n!='4') {
				System.out.println("Error !!! please re-enter!");
			}
			switch(n) {
			case '1':ht.in();break;
			case '2':ht.find();break;
			case '3':ht.delete();break;
			}
		}while(n!='4');
		System.out.println("Welcome to this system, goodbye!");
	}
}

class Hashtable extends hash{
	Scanner in=new Scanner(System.in);
	int i;
	String num,name,add,jud;
	hash[] table=new hash[7];
	public Hashtable(){
		for(i=0;i<7;i++) {
			table[i]=new hash();
		}
	}
	
	public void in() {
		System.out.print("Name");
		name=in.next();
		System.out.print("telephone number ");
		num=in.next();
		System.out.print("Address");
		add=in.next();
		table[mod(num)].inhash(name,num,add);
		System.out.println("Entry Success!");
	}
	
	public void find() {
		System.out.println("Find By Name: 1");
		System.out.println("Find by telephone: 2");
		jud=in.next();
		if(jud.equals("1")) {
			System.out.print("Find a Name");
			name=in.next();
			for(i=0;i<7;i++) {
				if(table[i].findname(name)!=null) {
					System.out.println("Name:"+table[i].t.name+" telephone number:"+table[i].t.num+"Address:"+table[i].t.add);
					jud="";
				}
			}
			if(jud.equals("1")) {
				System.out.println("No such person!");
			}
		}else if(jud.equals("2")) {
			System.out.print("Find Phone");
			num=in.next();
			i=mod(num);
			if(table[i].findnum(num)!=null) {				
				System.out.println("Name:"+table[i].t.name+" telephone number:"+table[i].t.num+"Address:"+table[i].t.add);
				jud="";
			}
			if(jud.equals("2")) {
				System.out.println("No such person!");
			}
		}else {
			System.out.println("No such person!");
		}
		
	}
	
	public void delete() {
		System.out.print("Delete Contact Name");
		name=in.next();
		for(i=0;i<7;i++) {
			if(table[i].deletehash(name)) {
				System.out.println("successfully deleted!");
			}				
		}
		if(i==7) {
			System.out.println("No such person!");
		}
	}
	
	public int mod(String num) {
		int a=0;
		for(int i=0;i<num.length();i++) {
			a=Integer.parseInt(num.charAt(i)+"");
		}
		return a%7;
	}
	
}
class hash{
	int n;
	node head=new node(null,null,null);
	node t;
	
	public hash() {
		n=0;
		head.next=null;
	}
	
	class node{
		String num,name,add;
		node next;
		public node(String name,String num,String add) {
			this.num=num;
			this.name=name;
			this.add=add;
			next=null;
		}
	}
	
	public void inhash(String name,String num,String add) {
		n++;
		node no=new node(name,num,add);
		no.next=head.next;
		head.next=no;
	}
	
	public node findname(String name) {
		t=head.next;
		while(t!=null) {
			if(t.name.equals(name)) {
				return t;
			}else {
				t=t.next;
			}
		}
		return null;
	}
	
	public node findnum(String num) {
		t=head.next;
		while(t!=null) {
			if(t.num.equals(num)) {
				return t;
			}else {
				t=t.next;
			}
		}
		return null;
	}
	
	public boolean deletehash(String name) {
		node tde=findname(name);
		if(tde!=null) {
			t=head;
			while(t.next!=tde) {
				t=t.next;
			}
			t.next=tde.next;
			return true;
		}
		return false;
	}
}