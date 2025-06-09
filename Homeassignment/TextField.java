package Homeassignment;

public class TextField extends Webelement {
	
	public void getText()
	{
		System.out.println("gettext method enabled in textfield class");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TextField tf = new TextField();
      tf.getText();
      tf.click();
      tf.setText(null);
	}

}
