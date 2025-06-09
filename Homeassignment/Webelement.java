package Homeassignment;

public class Webelement {

	public void click(){
		System.out.println("click method is enabled in webelement class");	// TODO Auto-generated constructor stub
	}
    
	public void setText(String text)
	{
		System.out.println("setTest method is enabled in webelement class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Webelement webel = new Webelement();
      webel.click();
      webel.setText("");
          
	}

}
