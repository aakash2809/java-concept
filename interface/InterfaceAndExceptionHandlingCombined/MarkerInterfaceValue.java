package newpackage;

public class MarkerInterfaceValue{
	
	public static void mobalitycheck(Object j) throws Notmovablthing 
	{
		if(j instanceof MarkerInterfaceDemo)
		{
			
			System.out.println(j.getClass()+" is a movable thing");
		}
		else
			
		{
			throw new Notmovablthing(j.getClass()+"is not movable thing");
		}
		
	}

	

}
