package Test;

public class Employee implements Comparable {
	private int id;
	private String name;
	private int sal;

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		if(this.getId()>e.getId())
		{
			return  1;
			
		}
		else if(this.getId()<e.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	
		
	}

}
