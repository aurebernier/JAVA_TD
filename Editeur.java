public class Editeur {
	private String nom_Editeur, ville, nom_PDG, prenom_PDG; 

	public String getPrenom_PDG() {
		return prenom_PDG;
	}
	public void setPrenom_PDG(String prenom_PDG) {
		this.prenom_PDG = prenom_PDG;
	}
	public String getNom_PDG() {
		return nom_PDG;
	}
	public void setNom_PDG(String nom_PDG) {
		this.nom_PDG = nom_PDG;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getNom_Editeur() {
		return nom_Editeur;
	}
	public void setNom_Editeur(String nom_Editeur) {
		this.nom_Editeur = nom_Editeur;
	}
	
	public Editeur(String nom_Editeur, String ville, String nom_PDG, String prenom_PDG) {
		this.setNom_Editeur (nom_Editeur);
		this.setVille (ville);
		this.setNom_PDG (nom_PDG);
		this.setPrenom_PDG (prenom_PDG);
	}
	
	public String toString() {
		return "Editeur nom_Editeur=" + nom_Editeur + ", ville=" + ville + ", nom_PDG=" + nom_PDG + ", prenom_PDG="
				+ prenom_PDG ;
	}

}