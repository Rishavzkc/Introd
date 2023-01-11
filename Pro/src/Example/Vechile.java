package Example;

public class Vechile {

	

		private String name;
    	private int id;
		
		public Vechile() {
			
		}
		public Vechile(String name, int id) {
		
			this.name = name;
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
		public void run() {
			System.out.println("Vechile is Running");
		}

		
}
