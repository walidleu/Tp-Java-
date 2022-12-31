
public class main {

	public static void main(String[] args) {

		Personne[] Pers=new Personne[100];
		
		Secretaire s1=new Secretaire("secretaire 1","sec 1","adresse secretaire 1",33,1);
		Enseignant e1=new Enseignant("enseignant 1","enseignant 1","adresse enseignant 1",30,45,false,"Poo");
		Enseignant e2=new Enseignant("enseignant 2","enseignant 2","adresse enseignant 2",45,60,true,"Math");
		Etudiant etu1=new Etudiant("etudiant 1","etudiant 1","adresse etudiant 1",20,15,"info");
		Etudiant etu2=new Etudiant("etudiant 2","etudiant 2","adresse etudiant 2",21,16,"info");
		Etudiant etu3=new Etudiant("etudiant 3","etudiant 3","adresse etudiant 3",20,10,"info");
		Secretaire s2=new Secretaire("secretaire 2","sec 2","adresse secretaire 2",48,2);
		Etudiant etu4=new Etudiant("etudiant 4","etudiant 4","adresse etudiant 4",20,8,"info");
		Enseignant e3=new Enseignant("enseignant 3","enseignant 3","adresse enseignant 3",45,60,true,"Math");
		
		
		int i=0;
		
		
			Pers[0]=s1;
			Pers[1]=e1;
			Pers[2]=e2;
			Pers[3]=etu1;
			Pers[4]=etu2;
			Pers[5]=etu3;
			Pers[6]=s2;
			Pers[7]=etu4;
			Pers[8]=e3;
			
			
			while (Pers[i] !=null)
			{
				Pers[i].ecrirePersonne();
				i++;
			}
			
		System.out.println("Nombre Personne : "+Personne.nbr);	
		System.out.println("Nombre Etudiant : "+Etudiant.nb_etudiants);
		System.out.println("Nombre Enseignant : "+Enseignant.nb_enseignants);	
		System.out.println("Nombre Secretaire : "+Secretaire.nb_secretaires);	
		
		for(i=0;i<Personne.nbr-1;i++)
		
		{
			Personne p;
			
			if (Pers[i].getClass().getSimpleName() == "Etudiant" && Pers[i+1].getClass().getSimpleName() == "Enseignant")
			{
			p=Pers[i];
			Pers[i]=Pers[i+1];
			Pers[i+1]=p;
			i=0;
			}
			else if (Pers[i].getClass().getSimpleName() == "Enseignant" && Pers[i+1].getClass().getSimpleName() == "Secretaire")
			{
				p=Pers[i];
				Pers[i]=Pers[i+1];
				Pers[i+1]=p; 
				i=0;
			}
			else if (Pers[i].getClass().getSimpleName() == "Etudiant" && Pers[i+1].getClass().getSimpleName() == "Secretaire")
			{
				p=Pers[i];
				Pers[i]=Pers[i+1];
				Pers[i+1]=p;
				i=0;
			}
			else ;
			
		}
		i=0;
		while (Pers[i] !=null)
		{
			Pers[i].ecrirePersonne();
			i++;
		}
	}

}
