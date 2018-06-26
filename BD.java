public class BD extends Livre {
	private Collection collection;
	public BD(String titre, String nb_page, Auteur auteur, Prix prix, String code_Traifaire,Collection collection) {
		super(titre, nb_page, auteur, prix, code_Traifaire);
		this.setCollection(collection);
	}
		
	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
		collection.ajouterBD(this);
	}

	public String toString() {
		return super.toString()
		+" C'est une BD.";
	}
}
