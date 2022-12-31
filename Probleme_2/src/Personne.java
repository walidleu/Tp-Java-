
public abstract class Personne {

private String nom;
private String prenom;
private String adresse;
private int age;
public static int nbr=0;
Personne (String lenom,String leprenom,String ladresse,int lage)
{
	nom=lenom;
	prenom=leprenom;
	age=lage;
	adresse=ladresse;
	nbr++;
}

public String toString()
{
	return "le Nom : "+nom+" Prenom : "+prenom+" Age :"+age+" Adresse : "+adresse;
}

public abstract void ecrirePersonne();

public static void nbPersonne()
{
	System.out.println("le nombre totale de personne est :"+nbr);
}

void modifierPersonne(String NvlAdresse)
{
	adresse=NvlAdresse;
	this.ecrirePersonne();
}


}
