
public class useDeo implements Command {
	deodorant theDeodorant;
	public useDeo(deodorant newDeodorant)
	{
		theDeodorant = newDeodorant;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	theDeodorant.sprayDeo(theDeodorant);
	}
}
