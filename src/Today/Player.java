package Today;

public class Player {

	private String name;
	private int runs;
	public Player(String name,int runs)
	{
		this.name=name;
		this.runs=runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}

}
