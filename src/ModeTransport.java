
public class ModeTransport {
	private int id;
	private String title;
	private double prix;
	
	public ModeTransport(int id, String title, double prix) {
		super();
		this.id = id;
		this.title = title;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "ModeTransport [id=" + id + ", title=" + title + ", prix=" + prix + "]";
	}
	
	
	
}
