
public class Roman extends Livre{
	
	public String Couverture;
	public Roman(String titre, String nb_page, Auteur auteur, Prix prix, String code_Traifaire, String couverture) {
		super(titre, nb_page, auteur, prix, code_Traifaire);
		this.setCouverture(couverture);
	}

	public String getCouverture() {
		return Couverture;
	}
	public void setCouverture(String couverture) {
		Couverture = couverture;
	}
	
public String toString() {
	return super.toString()
	+" C'est un roman."+this.getCouverture();
}
}