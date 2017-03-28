public class WinnerState implements State
{
	GumballMachine machine; 
	
	
	public WinnerState(GumballMachine machine)
	{
		this.machine = machine; 
	}
	
	public void insertQuarter()
	{
		System.out.println("You inserted a quarter");
	}
	
	public void ejectQuarter()
	{
		System.out.println("Quarter returned");
		machine.setState(machine.getNoQuarterState());
	}
	
	public void turnCrank()
	{
		System.out.println("You turned...");
		System.out.println("YOU ARE A WINNER! You get two gumballs for your quarter.");
		machine.setState(machine.getWinnerState());
		// dispense(); 
	}
	
	public void dispense()
	{
		machine.releaseBall();
		machine.releaseBall();
	}
}