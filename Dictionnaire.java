
public class Dictionnaire extends Livre{

	public Dictionnaire(String titre, String nb_page, Auteur auteur, Prix prix, String code_Tarifaire) {
		super(titre, nb_page, auteur, prix, code_Tarifaire);
		
	}
	public String toString() {
		return super.toString()
		+" C'est un dictionnaire.";
	}
}
