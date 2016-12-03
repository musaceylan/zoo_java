
public class Room{
	
	private Occupant occupant;
	
	private Room left;
	private Room right;
	
	public Room(Occupant occupant){

		left = null;
		right = null;
		
		this.occupant = occupant;
		
	}
	
	public void setLeft(Room left)
	{
		this.left = left;
	}
	
	public void setRight(Room right)
	{
		this.right = right;
	}

	public Occupant getOccupant(){
		
		return this.occupant;
	}
	
	
	public Room getLeft(){
		return this.left;
	}
	
	public Room getRight(){
		return this.right;
	}
	
}



