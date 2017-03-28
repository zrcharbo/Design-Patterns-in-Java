public class SoldState implements State
{
	GumballMachine machine; 
	
	
	public SoldState(GumballMachine machine)
	{
		this.machine = machine; 
	}
	
	public void insertQuarter()
	{
		System.out.println("Please wait, we are already giving you a gumball");
	}
	
	public void ejectQuarter()
	{
		System.out.println("Sorry, you already turned the crank");
	}
	
	public void turnCrank()
	{
		System.out.println("Turning twice does not give you another gumball");
	}
	
	public void dispense()
	{
		// we are in the SOLD state; give them a gumball
		System.out.println("A gumball comes rolling out of the slot");
		machine.count--;
		if (machine.count == 0) {
			// if this was the last one, we set the machine' state to
			// SOLD_OUT;
			System.out.println("Oops, out of gumballs");
			 machine.setState(machine.getSoldOutState());
		}
		else {
			// otherwise we are back to not having a quarter
				machine.setState(machine.getNoQuarterState());
		}
	}
}