
public class Flower implements Occupant {
	
	
	private String name;
	private String smell;
	
	
	public Flower(String flowerName)
	   {    
	      name = flowerName;
	   }

	
	 public String toString()
	   {
	      return name;
	   }


	public String getSmell() {
		return smell;
	}


	public void setSmell(String smell) {
		this.smell = smell;
	}


	@Override
	public void animate() {
		// TODO Auto-generated method stub
		System.out.print(this.smell);
	}





}
