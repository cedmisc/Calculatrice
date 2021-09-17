
public class Dialogue {

	public static boolean veutContinuer ()
	{
	
		char reponse;
		boolean continuer;
		
		do
		{
			System.out.println ("Voulez-vous continuer?");
			reponse = Lire.c();
		}
		while (reponse != 'o' && reponse != 'O' && reponse != 'n' && reponse != 'N');
		
		if (reponse == 'o' || reponse == 'O')
		{
			continuer = true;
		}
		else
		{
			continuer = false;
		}
		
		return continuer;

	}
}
