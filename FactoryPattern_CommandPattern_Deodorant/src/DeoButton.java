
public class DeoButton {
Command theCommand;
public DeoButton(Command newCommand)
{
	theCommand=newCommand;
}
public void press()
{
	theCommand.execute();
}
}
