public class MondeDesLivres {

	public static void main(String[] args) {
		Editeur ed1 = new Editeur("De Fallois eds","Turin","MEGNE DEFFO","Sandrine");
		Editeur ed2 = new Editeur("Bayard Jeunesse","Lyon","BERNIER","Aure");
//		System.out.println("L'�diteur " + ed1.getNom_Editeur() + " situ� � " + ed1.getVille() + " est dirig� par " + ed1.getNom_PDG() + " "+ ed1.getPrenom_PDG());
		
		Auteur a1 = new Auteur("Dicker", "Jo�l", "auteur � succ�s","romans",ed1);
		Auteur a2 = new Auteur("Bruno", "Muscat", "mon auteur favori", "romans",ed2);
		Auteur a3 = new Auteur ("St�phen","Rostain","arch�ologue","documentaire",ed1);
		Auteur a4 = new Auteur("Collectif"," ","regroupement de litt�raire","dictionnaire",ed2);
//		System.out.println("L'auteur " + a1.getNom_Auteur() + " " + a1.getPrenom_Auteur() +" est un(e) "+a1.getBiographie()+". Il(elle) �crit principalement des "+a1.getType_ouvrage());
		
		Prix p1 = new Prix ("Prix Goncourt", "ABDELLI Sarah",1903);
		Prix p2 = new Prix ("Grand prix du livre d'arch�ologie 2017", "AUBERT Alexiane",1996);
//		System.out.println("Le "+p1.getNom_Prix()+" est pr�sid� par "+p1.getPresident_Jury()+" a �t� cr�e en "+p1.getAnnee_Creation());
		
		Collection c1 = new Collection ("Princesse Z�lina");
		
		Roman r1 = new Roman ("La v�rit� sur l'affaire Harry Quebert","672", a1, p1, "2"," La 4�me de couverture");		
		BD b1 = new BD("Princess Z�lina 12 - L'�toile des neiges","45",a2, p1,"1",c1);
		Documentaire doc1 = new Documentaire("Amazonie : les 12 travaux des civilisations pr�colombiennes","200",a3,p2,"3");
		Dictionnaire dico1 = new Dictionnaire("Le petit Larousse illustr� 2018","3000",a4,p1,"4");
//		System.out.println("L'�diteur du livre " +r1.getTitre()+" est situ� � "+ed1.getVille());
		
		r1.ajouterAuteur(a1);
		r1.supprimerAuteur(a1);
		
	System.out.println(r1.toString());
		System.out.println(b1.toString());
		System.out.println(doc1.toString());
		System.out.println(dico1.toString());
	}
}