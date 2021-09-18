public class deodorantFactory {
public deodorant DeoClassify(String deoClassify)
{
	deodorant newDeo=null;
	if(deoClassify.equals("1"))
	{
		return new AXE();
	}
	else
		if(deoClassify.equals("2"))
		{
		return new SUAVE();
		}
	else
		if(deoClassify.equals("3"))
		{
			return new DISCO();
		}
		else
			if(deoClassify.equals("4"))
			{
				return new CALVINKLEIN();
			}
			else
				if(deoClassify.equals("5"))
				{
					return new DOVE();
				}
				else
					if(deoClassify.equals("6"))
					{
						return new CURIE();
					}
		else return null;
	
}
}
