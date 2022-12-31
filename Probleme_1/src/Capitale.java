
public class Capitale extends Ville{
String pays;

Capitale(String leNom,String lePays)
{
	super(leNom);
	pays=lePays;
}

Capitale(String leNom,String lePays,int leNbHab)
{
	super(leNom,leNbHab);
	pays=lePays;
}

public String getPays() {
	return pays;
}

public void setPays(String pays) {
	this.pays = pays;
}

public String presenteToi()
{
	String presente=super.presenteToi()+" Capitale de "+this.getPays();
	
	return presente;
}

}
