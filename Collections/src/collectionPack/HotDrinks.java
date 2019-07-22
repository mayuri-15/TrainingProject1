package collectionPack;
import java.util.List;
import java.util.Set;

public class HotDrinks {
	
	private Set <String> drinks;

	public Set<String> getDrinks() {
		return drinks;
	}

	public void setDrinks(Set<String> drinks) {
		this.drinks = drinks;
	}

	public HotDrinks(Set<String> drinks) {
		super();
		this.drinks = drinks;
	}
	public HotDrinks(){
		super();
	}

}
