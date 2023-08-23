package Collection;

public class VectorAO {
	private int id;
	private  int runs;
	private String name;
	public VectorAO(int id, int runs, String name) {
		super();
		this.id = id;
		this.runs = runs;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
