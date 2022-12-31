
public class Ville {
	
private String nom;
int nbHab;

public int getNbHab() {
	return nbHab;
}


public void setNbHab(int nbHab) {
	this.nbHab = nbHab;
}


public String getNom() {
	return nom;
}


Ville (String leNom)
{
	nom=leNom;
	this.setNbHab(-1);
}

Ville (String leNom,int leNbHab)
{
	nom=leNom;
	if (leNbHab >= 0)
	{
	this.setNbHab(leNbHab);;
	}
	else
	{
		System.out.println("Un nombre d'habitant doit etre positif");
		this.setNbHab(-1);
	}
}

public String presenteToi()
{
	String presente=" Ville "+this.getNom()+" nombre d'habitant ";
	
	if(this.nbHab == -1)
	{
		presente = presente + "Inconnu";
	}
	else 
	{
		presente = presente +" = "+this.getNbHab();
	}
	return presente;
}

}
