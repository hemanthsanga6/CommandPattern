
public class lockDeo implements Command {
	deodorant theDeodorant;
	public lockDeo(deodorant newDeodorant)
	{
		theDeodorant = newDeodorant;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	theDeodorant.lockOn(theDeodorant);
	}
	

}
