package Homeassignment;

public class Button extends Webelement{
	
	public void submit()
	{
		System.out.println("submit enabled in button class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Button but = new Button();
      but.click();
      but.setText(null);
      but.submit();
	}

}
