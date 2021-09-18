import java.util.Scanner;
public class DeodorantTesting {
	public static void main(String[] args)
	{
		deodorantFactory factory=new deodorantFactory();
		deodorant theDeo=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("What type of Deo are you looking?");
		System.out.println("press the corresponding options from 1-6\n"
				+ "1)24 hour protection\n"
				+ "2)Anti Perspirant\n"
				+ "3)Anti Bacterial\n"
				+ "4)0% Alcohol\n"
				+ "5)No Marks On Clothes\n"
				+ "6)No Dark Underarms\n");
		
		if(sc.hasNextLine())
		{
			String typeOfDeo = sc.nextLine();
		theDeo = factory.DeoClassify(typeOfDeo);
		  
		}
		if(theDeo!=null)
		{
			doStuffDeo(theDeo);
		}else
			System.out.println("null ");
		
	}
		
	
	public static void doStuffDeo(deodorant aDeodorant)
	{
		aDeodorant.describeDeo();
		//Methods implemented using the command pattern instead
		//----------------------------------------------------
		//lockOn();
		unlockDeo unlockCommand = new unlockDeo(aDeodorant);
		DeoButton offPressed = new DeoButton(unlockCommand);
		offPressed.press();
		//-----------------------------------------------------
		//aDeodorant.sprayDeo(aDeodorant);
		useDeo useCommand = new useDeo(aDeodorant);
		DeoButton usePressed = new DeoButton(useCommand);
		usePressed.press();
		//-----------------------------------------------------
		//lockOn();
		lockDeo lockCommand = new lockDeo(aDeodorant);
		DeoButton onPressed = new DeoButton(lockCommand);
		onPressed.press();
		
	}
}
