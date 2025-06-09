package Homeassignment;

public class Library {
	
 
public String addbook(String bookTitle)
  {
	String a = "Wings of Fire";
	return a;
  }

  public String addbook1(String bookTitle)
  {
	String b = "India 2020";
	return b;
  }
  
  public void issueBook()
  {
	  System.out.println("Book issued Scuccessfully");
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname obj=new classname
      Library Lib = new Library();
      String book=Lib.addbook("bookTitle");
      System.out.println(book  + "  A.P.J Notable works");  
      String book1=Lib.addbook1("bookTitle");
      System.out.println(book1 + "     A.P.J Notable works");  
     Lib.issueBook();
      
	}

}
