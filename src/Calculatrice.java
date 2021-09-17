
public class Calculatrice {

	// Ce programme fonctionne comme une calculatrice
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int op1;
		int op2;
		char operateur;
		int resultat;
		boolean autreCalcul;
		
		System.out.println("Bienvenue!");
		
		do {
		
		System.out.println("Entrez un premier nombre: ");
		op1 = Lire.Entier();
		
		System.out.println("Entrez un second nombre: ");
		op2 = Lire.Entier();
		
		do
		{
		System.out.println("Entrez un opérateur valide: ");
		operateur = Lire.c();
		}
		while (operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/');
		
		// Le programme effectue alors le calcul si possible
			switch (operateur)
			{
			case '+':
				resultat = op1 + op2;
				System.out.println("Le résultat de l'opération " + op1 + " + " + op2 + " est " + resultat);
				break;
				
			case '-':
				resultat = op1 - op2;
				System.out.println("Le résultat de l'opération " + op1 + " - " + op2 + " est " + resultat);
				break;
				
			case '*':
				resultat = op1 * op2;
				System.out.println("Le résultat de l'opération " + op1 + " * " + op2 + " est " + resultat);
				break;	
				
			case '/':
				if (op2 != 0)
				{
					resultat = op1 / op2;
					System.out.println("Le résultat de l'opération " + op1 + " / " + op2 + " est " + resultat);
				}
				else 
				{
					System.out.println("Erreur. Une divison par zéro est impossible.");
				}
				break;	
			
			default:
				System.out.println("Erreur. L'opérateur indiqué n'est pas valide.");
			}
			
			autreCalcul = Dialogue.veutContinuer();
		}
		while (autreCalcul != false);
	}
	
	
	public static int saisirOperande(String numOperande)
	{
		System.out.println("Entrez un " + numOperande + " nombre: ");
		int operande = Lire.Entier();
		
		return operande;
	}
	
	public static char saisirOperateur()
	{	
		System.out.println("Entrez un opérateur valide: ");
		char operateur = Lire.c();	
		
		return operateur;
	}
}
