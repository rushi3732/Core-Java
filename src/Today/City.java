package Today;
 class City implements Comparable{
	 private String City_Name;
	 private int Population;
	 
	  City(String City_Name,int  Population )
	  {
		  this.City_Name=City_Name;
		  this.Population=Population;
	  }
	public String getCity_Name() {
		return City_Name;
	}
	public void setCity_Name(String city_Name) {
		City_Name = city_Name;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	@Override
	public int compareTo(Object o) {
		City c=(City)o;
		if(this.getPopulation()>c.getPopulation())
		{
			return 1;
		}
		else if(this.getPopulation()<c.getPopulation())
		{
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	
}
