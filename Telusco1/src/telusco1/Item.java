/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telusco1;

/**
 *
 * @author ASUS
 */
public class Item {

   
  private int Id ;
  private String Book;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Book
     */
    public String getBook() {
        return Book;
    }

    /**
     * @param Book the Book to set
     */
    public void setBook(String Book) {
        this.Book = Book;
    }
    
}

class Main{
    public static void main(String[] args) {
        Item I = new Item();
        I.setId(100);
        I.setBook("Book");
        
        
        System.out.println(I.getId());
        System.out.println(I.getBook());
        
        
        
    }
}