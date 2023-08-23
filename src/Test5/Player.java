package Test5;

class Player implements Comparable{
	private int id;
	private String name;
	private int  runs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public int compareTo(Object o) {
		Player p=(Player)o;
		if(this.getId()>p.getId())
		{
			return 1;
		}
		else if(this.getId()<p.getId())
		{
			return -1;
		}
		else {
			return 0;
		
		}
		
	}
}

