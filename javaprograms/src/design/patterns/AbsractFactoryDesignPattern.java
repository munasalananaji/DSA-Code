package design.patterns;

public class AbsractFactoryDesignPattern {

	public static void main(String[] arhs)
	{
		new Windows().createButton().designButton();
		new Windows().createCheckbox().designCheckbox();
		//Viceversa can be written for the Mac also
	}
}

class Windows implements Application
{
 
	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowApplication();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowApplication();
	}
	
}

interface Application
{
	Button  createButton();
	Checkbox createCheckbox();
}
interface Button
{
	void designButton();
}
interface Checkbox
{
	void designCheckbox();
}

class WindowApplication implements Button, Checkbox
{

	@Override
	public void designCheckbox() {
		System.out.println("Write a steps to create windows button");
		
	}

	@Override
	public void designButton() {
		
		System.out.println("Write a steps to create windows checkbox");
	}
	
}
class MacApplication implements Button, Checkbox
{

	@Override
	public void designCheckbox() {
		System.out.println("Write a steps to create Mac button");
		
	}

	@Override
	public void designButton() {
		
		System.out.println("Write a steps to create Mac checkbox");
	}
	
}


