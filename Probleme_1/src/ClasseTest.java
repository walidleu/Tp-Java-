
public class ClasseTest {

	public static void main(String[] args) {
	
		Ville v1 = new Ville("Lyon",1500000);
		Ville v2=new Ville("Bobigny");
		Ville v3=new Ville("Paris",10000000);
		
		Capitale c1=new Capitale(v3.getNom(),"France",v3.getNbHab());
		Capitale c2=new Capitale("Ouagadougou","Burkina-faso");
		
		System.out.println(v1.presenteToi());
		System.out.println(v2.presenteToi());
		
		System.out.println(c1.presenteToi());
		System.out.println(c2.presenteToi());
	}

}
