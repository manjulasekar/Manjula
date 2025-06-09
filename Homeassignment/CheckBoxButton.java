package Homeassignment;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton()
	{
		System.out.println("clickcheckbutton is enabled in checkboxbutton class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CheckBoxButton cbb = new CheckBoxButton();
      cbb.clickCheckButton();
      cbb.submit();
	}

}
