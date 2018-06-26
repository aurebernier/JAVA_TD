import java.util.ArrayList;

public class Auteur {
	private String nom_Auteur,prenom_Auteur, biographie, type_ouvrage;
	private Editeur editeur;
	private ArrayList <Livre>titres = new ArrayList <Livre>();
	
	public ArrayList<Livre> getTitres() {
		return titres;
	}
	public void ajouterTitre(Livre titres) {
		this.titres.add(titres);
	}	
	public void setTitres(ArrayList<Livre> titres) {
		this.titres = titres;
	}
	public String getPrenom_Auteur() {
		return prenom_Auteur;
	}
	public void setPrenom_Auteur(String prenom_Auteur) {
		this.prenom_Auteur = prenom_Auteur;
	}
	public String getBiographie() {
		return biographie;
	}
	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}
	public String getType_ouvrage() {
		return type_ouvrage;
	}
	public void setType_ouvrage(String type_ouvrage) {
		this.type_ouvrage = type_ouvrage;
	}
	public String getNom_Auteur() {
		return nom_Auteur;
	}
	public void setNom_Auteur(String nom_Auteur) {
		this.nom_Auteur = nom_Auteur;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public Auteur (String nom_Auteur,String prenom_Auteur, String biographie, String type_ouvrage, Editeur editeur){
	this.setNom_Auteur(nom_Auteur);
	this.setPrenom_Auteur (prenom_Auteur);
	this.setBiographie (biographie);
	this.setType_ouvrage (type_ouvrage);
	this.setEditeur(editeur);
}

	@Override
	public String toString() {
		return "Auteur nom_Auteur=" + nom_Auteur + ", prenom_Auteur=" + prenom_Auteur + ", biographie=" + biographie
				+ ", type_ouvrage=" + type_ouvrage + ", editeur=" + editeur ;
	}
}