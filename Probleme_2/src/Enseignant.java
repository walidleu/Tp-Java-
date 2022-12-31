
public class Enseignant extends Personne {

private int nbHeuresCours;
private boolean grincheux ;
private String specialite;
public static int  nb_enseignants=0;

Enseignant(String lenom, String leprenom, String ladresse, int lage,int NbHeuresCours,boolean Grincheux,String Specialite) {
		super(lenom, leprenom, ladresse, lage);
		nbHeuresCours=NbHeuresCours;
		grincheux=Grincheux;
		specialite=Specialite;
		nb_enseignants++;
	}

public String toString()
{
	return super.toString()+"nombre heures cours : "+nbHeuresCours+"specialite : "+specialite +"se plaint continuellement : "+grincheux;
}

public void ecrirePersonne()
{
	System.out.println("Enseignant :");
	System.out.println(this.toString());
}

public double salaireEnseignant(double p)
{
	if(p<=1)
	{
		return nbHeuresCours*300.99;
	}
	else if(p>1 && grincheux==false)
	{
		return 40*300.99+(nbHeuresCours-40)*1.5;
	}
	else	
	{
		return nbHeuresCours*300.99;
	}
}
}
