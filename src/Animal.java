
public class Animal implements Occupant {
	
	private String name;
	
	private String voice;
	
	
	public Animal(String animalName)
	   {    
	      this.name = animalName;
	   }
	 
	
	 public String toString()
	   {
	      return name;
	   }


	public String getVoice() {
		return voice;
	}


	public void setVoice(String voice) {
		this.voice = voice;
	}


	@Override
	public void animate() {
		// TODO Auto-generated method stub
		System.out.println(this.voice);
	}

}
