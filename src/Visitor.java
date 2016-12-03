
public class Visitor {
	
	private String Name;
	private Room currentRoom;
	
	public Visitor (){
		
		
	}
	
	public void setCurrentRoom(Room r){
		
		currentRoom =r ;
		
	}
	
	public Room getCurrentRoom(){
		
		return currentRoom;
	} 
}
