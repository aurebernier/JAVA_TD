import java.util.ArrayList;

public class Livre {
	protected String titre,nb_page;
	private Auteur auteur;
	private Prix prix;
	protected String code_Tarifaire;
	private Editeur editeur;
	private ArrayList <Auteur>auteurs = new ArrayList <Auteur>();
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	public Prix getPrix() {
		return prix;
	}
	public void setPrix(Prix prix) {
		this.prix = prix;
	}
	public String getCode_Tarifaire() {
		return code_Tarifaire;
	}
	public void setCode_Tarifaire(String code_Tarifaire) {
		this.code_Tarifaire = code_Tarifaire;
	}
	public void setNb_page(String nb_page) {
		this.nb_page = nb_page;
	}
	public String getNb_page() {
	return nb_page;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	public ArrayList <Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(ArrayList <Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	public Livre (String titre, String nb_page, Auteur auteur, Prix prix, String code_Traifaire){
this.setTitre(titre);
this.setNb_page(nb_page);
this.setAuteur(auteur);
this.setPrix(prix);
this.setCode_Tarifaire(code_Traifaire);
}
	
	public void ajouterAuteur(Auteur auteur) {
		this.getAuteurs().add(auteur);
	}
	public void supprimerAuteur(Auteur auteur) {
		this.getAuteurs().remove(auteur);
	}
	
public String toString() {
	return "Le titre du livre est " + this.getTitre() + ", il y a " + this.getNb_page() + " de pages, l'auteur est " + this.getAuteur().getNom_Auteur()+" "+this.getAuteur().getPrenom_Auteur()+" et le prix est " + this.getPrix().getNom_Prix() + " (code_Tarifaire " + this.getCode_Tarifaire()+")."+this.getCode_Tarifaire()+". L'éditeur est "+this.getEditeur().getNom_Editeur();
}
}