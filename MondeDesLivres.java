public class MondeDesLivres {

	public static void main(String[] args) {
		Editeur ed1 = new Editeur("De Fallois eds","Turin","MEGNE DEFFO","Sandrine");
		Editeur ed2 = new Editeur("Bayard Jeunesse","Lyon","BERNIER","Aure");
//		System.out.println("L'éditeur " + ed1.getNom_Editeur() + " situé à " + ed1.getVille() + " est dirigé par " + ed1.getNom_PDG() + " "+ ed1.getPrenom_PDG());
		
		Auteur a1 = new Auteur("Dicker", "Joël", "auteur à succès","romans",ed1);
		Auteur a2 = new Auteur("Bruno", "Muscat", "mon auteur favori", "romans",ed2);
		Auteur a3 = new Auteur ("Stéphen","Rostain","archéologue","documentaire",ed1);
		Auteur a4 = new Auteur("Collectif"," ","regroupement de littéraire","dictionnaire",ed2);
//		System.out.println("L'auteur " + a1.getNom_Auteur() + " " + a1.getPrenom_Auteur() +" est un(e) "+a1.getBiographie()+". Il(elle) écrit principalement des "+a1.getType_ouvrage());
		
		Prix p1 = new Prix ("Prix Goncourt", "ABDELLI Sarah",1903);
		Prix p2 = new Prix ("Grand prix du livre d'archéologie 2017", "AUBERT Alexiane",1996);
//		System.out.println("Le "+p1.getNom_Prix()+" est présidé par "+p1.getPresident_Jury()+" a été crée en "+p1.getAnnee_Creation());
		
		Collection c1 = new Collection ("Princesse Zélina");
		
		Roman r1 = new Roman ("La vérité sur l'affaire Harry Quebert","672", a1, p1, "2"," La 4ème de couverture");		
		BD b1 = new BD("Princess Zélina 12 - L'étoile des neiges","45",a2, p1,"1",c1);
		Documentaire doc1 = new Documentaire("Amazonie : les 12 travaux des civilisations précolombiennes","200",a3,p2,"3");
		Dictionnaire dico1 = new Dictionnaire("Le petit Larousse illustré 2018","3000",a4,p1,"4");
//		System.out.println("L'éditeur du livre " +r1.getTitre()+" est situé à "+ed1.getVille());
		
		r1.ajouterAuteur(a1);
		r1.supprimerAuteur(a1);
		
	System.out.println(r1.toString());
		System.out.println(b1.toString());
		System.out.println(doc1.toString());
		System.out.println(dico1.toString());
	}
}