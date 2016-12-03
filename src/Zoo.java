import java.util.ArrayList;


public class Zoo {

	
	private String name;
	
	private ArrayList<Room> rooms;
	
	public String getName()
	{
		return name;
	}
	
	public Zoo(String zooName){
		name = zooName;
		rooms = new ArrayList<Room>();
	}
	
	public Room enter(){
		
		return getRooms().get(0);
		
	}
	
	public void exit(){
		
		System.out.print("Bye Bye"); 
		
	}

	public ArrayList<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
}
