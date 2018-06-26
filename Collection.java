import java.util.ArrayList;

public class Collection {
	private String Collection;
	private ArrayList <BD>collections = new ArrayList <BD>();
	
public String getCollection() {
		return Collection;
	}
	public void setCollection(String collection) {
		Collection = collection;
	}
public ArrayList <BD> getCollections() {
		return collections;
	}
	public void setCollections(ArrayList <BD> collections) {
		this.collections = collections;
	}
public void ajouterBD(BD b1){
	this.getCollections().add(b1);
}
public Collection(String collection) {
	super();
	Collection = collection;
}
}