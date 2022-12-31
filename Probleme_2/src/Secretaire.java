
public class Secretaire extends Personne {

private int numeroBureau;
public static int nb_secretaires;

Secretaire(String lenom, String leprenom, String ladresse, int lage,int NumeroBureau) {
		super(lenom, leprenom, ladresse, lage);
		numeroBureau=NumeroBureau;
		nb_secretaires++;
	} 

public String toString()
{
	return super.toString()+"numero de bureau :"+numeroBureau;
}

public void ecrirePersonne()
{
	System.out.println("Secretaire :");
	System.out.println(this.toString());
}
}
