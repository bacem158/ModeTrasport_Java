import java.util.ArrayList;

public class Transport {
	private ArrayList<ModeTransport> liste;
	
	public Transport() {
		super();
		this.liste = new ArrayList<ModeTransport>();
	}
	
	public Transport(ArrayList<ModeTransport> liste) {
		super();
		this.liste = new ArrayList<ModeTransport>();
	}
	
	public ArrayList<ModeTransport> getListe() {
		return liste;
	}

	public void setListe(ArrayList<ModeTransport> liste) {
		this.liste = liste;
	}
	
	public void addTansport(ModeTransport t) {
		this.liste.add(t);
	}
}
