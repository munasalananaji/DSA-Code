package design.patterns;

public class StrategeyDesignPattern {
	//Selecting the algorthim at runtime
	public static void main(String[] args)
	{
		withDrawAmount(new Withdraw()).withDraw();
		withDrawAmount(new CardWithdraw()).withDraw();
	}
	public static Atm withDrawAmount(Atm atm)
	{
		return atm;
	}

}
interface Atm 
{
	void withDraw();
}
class Withdraw implements Atm
{
	public void withDraw()
	{
		System.out.println("Withdrawing the money");
	}
}

class CardWithdraw implements Atm {
    public void withDraw() {
        System.out.println("Withdrawing using card");
    }
}
