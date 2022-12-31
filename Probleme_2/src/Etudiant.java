
public class Etudiant extends Personne {

private int noteMoyenne;
private String diplomeEnCours;
public static int nb_etudiants=0;

Etudiant(String lenom, String leprenom, String ladresse, int lage,int NoteMoyenne,String DiplomeEnCours) {
		super(lenom, leprenom, ladresse, lage);
		diplomeEnCours=DiplomeEnCours;
		noteMoyenne= NoteMoyenne;
		nb_etudiants++;
	}

public String toString()
{
	return super.toString()+"diplome en cours :"+diplomeEnCours+"  note moyenne :"+noteMoyenne;
}

public void ecrirePersonne()
{
	System.out.println("Etudiant : ");
	System.out.println(this.toString());
}


}
