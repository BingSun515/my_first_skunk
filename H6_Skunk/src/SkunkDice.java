
public class SkunkDice extends Dice
{
	
	public SkunkDice()
	{
	}

	public boolean isDoubleSkunk()
	{
		
		return getDie1().getLastRoll() == 1 && getDie1().getLastRoll() == 1; // return double skunk when die1 and die2 both equal to 1
		
	}
	
	
}