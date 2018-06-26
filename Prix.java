
public class Prix {
	private String nom_Prix, President_Jury;	
	private int annee_Creation;
	
	public String getNom_Prix() {
		return nom_Prix;
	}
	public void setNom_Prix(String nom_Prix) {
		this.nom_Prix = nom_Prix;
	}
	public String getPresident_Jury() {
		return President_Jury;
	}
	public void setPresident_Jury(String president_Jury) {
		President_Jury = president_Jury;
	}
	public int getAnnee_Creation() {
		return annee_Creation;
	}
	public void setAnnee_Creation(int annee_Creation) {
		this.annee_Creation = annee_Creation;
	}
	
	public Prix(String nom_Prix, String president_Jury, int annee_Creation) {
		super();
		this.setNom_Prix(nom_Prix);
		this.setPresident_Jury(president_Jury);
		this.setAnnee_Creation(annee_Creation);
	}
	
	public String toString() {
		return "Prix [nom_Prix=" + nom_Prix + ", President_Jury=" + President_Jury + ", annee_Creation="
				+ annee_Creation + "]";
	}	
}