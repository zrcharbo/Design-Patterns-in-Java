public class HasQuarterState implements State 
{
	GumballMachine machine; 
	
	
	public HasQuarterState(GumballMachine machine)
	{
		this.machine = machine; 
	}
	
	// a user can't insert more than one quarter 
	public void insertQuarter()
	{
		System.out.println("You can't insert another quarter.");
	}
	
	// return the quarter and set the state to "NoQuarter"
	public void ejectQuarter()
	{
		System.out.println("Quarter returned.");
		machine.setState(machine.getNoQuarterState());
	}
	
	 
	// they get a gumball so change the state then dispense a gumball
	public void turnCrank()
	{
		System.out.println("You turned...");
		machine.setState(machine.getSoldState());
		dispense();
	}
	
	//dispense the gumball
	public void dispense()
	{
		System.out.println("A Gumball was dispensed.");
	}
}