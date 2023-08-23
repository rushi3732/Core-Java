package Test;

public class Student {
	
		private int id;
		private String name;
		private int run;
		public Student(int id, String name, int run) {
			super();
			this.id = id;
			this.name = name;
			this.run = run;
		}
		
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
		public int getRun() {
			return run;
		}
		public void setRun(int run) {
			this.run = run;
		}
	
}
