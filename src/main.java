import java.util.Scanner;


public class main {
	

	public static void main(String[] args)
	 {
	 
	Zoo zoo = new Zoo("San Diego");
	 
	 System.out.println("Welcome to  Zoo " + zoo.getName());

     
     Animal lion = new Animal("lion");
     lion.setVoice("roarr"); 
     Animal orangutan = new Animal("orangutan");
     orangutan.setVoice("stract my ass ");
     Animal hippo = new Animal("hippo");
     hippo.setVoice("snort snort");
     
     Flower daisy = new Flower("daisy");
     daisy.setSmell("smells like daisy");  
     Flower orchid = new Flower("orchid");
     orchid.setSmell("smells lke orchid");
     
     
     
     
     
     Room roomLion = new Room(lion);
     Room roomOrangutan = new Room(orangutan);
     Room roomDaisy = new Room(daisy);
     Room roomOrchid = new Room(orchid);
     Room roomHippo = new Room(hippo);
     
     roomOrangutan.setLeft(null);
     roomOrangutan.setRight(roomLion);
     roomLion.setLeft(roomOrangutan);
     roomLion.setRight(roomDaisy);
     roomDaisy.setLeft(roomLion);
     roomDaisy.setRight(roomHippo);
     roomHippo.setLeft(roomDaisy);
     roomHippo.setRight(roomOrchid);
     roomOrchid.setLeft(roomHippo);
     roomOrchid.setRight(null);
     
     
     
     
     Visitor v = new Visitor();
	 
	 Scanner scan = new Scanner(System.in);
	 String answer = scan.nextLine();
     if ( !"Y".equals(answer) && !"N".equals(answer)){
         System.out.println("Do you want to enter Zoo "+  zoo.getName() +" Y or N ");
         scan.nextLine();
     }
     v.setCurrentRoom(zoo.getRooms().get(0));
     
     
	 System.out.print(v.getCurrentRoom().getOccupant() + "\n" ); 

    
     while (!zoo.getRooms().equals(null)){
    
  
    	 
    	 System.out.print("possible actions : Left = l , Right = r , Observe = o , Exit =e ");
    	 Scanner scanner = new Scanner(System.in);
    	 String answer1 = scan.nextLine();
    	 
    	 switch(answer1){
    		 
    		 case "l":
    			 
    			 v.setCurrentRoom(v.getCurrentRoom().getLeft());
    			 System.out.print(v.getCurrentRoom().getOccupant()+ "\n" );
    			 break;
    		 
    		 case "r":
    			 
    			 v.setCurrentRoom(v.getCurrentRoom().getRight());
    			 System.out.print(v.getCurrentRoom().getOccupant()+ "\n" );
    			 break;
    			 
    		 case "o":
    		 
    			 v.getCurrentRoom().getOccupant().animate();
    			 
    			 break;
    			 
    			 
    		 case  "e":
    			 	 
    			 zoo.exit();
    			 break;
    			  
    			 
    	 }
     }
     
     
     
     
      
     
     
     

}
	
}
