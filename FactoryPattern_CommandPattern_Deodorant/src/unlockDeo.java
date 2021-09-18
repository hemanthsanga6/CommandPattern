
public class unlockDeo implements Command {
	deodorant theDeodorant;
	public unlockDeo(deodorant newDeodorant)
	{
		theDeodorant = newDeodorant;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	theDeodorant.lockOff(theDeodorant);
	}
}
