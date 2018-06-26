
public class Documentaire extends Livre{
	private Auteur auteur;
	public Documentaire(String titre, String nb_page, Auteur auteur, Prix prix, String code_Traifaire) {
		super(titre, nb_page, auteur, prix, code_Traifaire);
		this.setAuteur(auteur);
	}

	public String toString() {
		return super.toString()
		+" C'est un documentaire.";
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
}