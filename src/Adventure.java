
// YOU HAVE 2 CHANCES TO FIND TREASURE MAP- SELECT YOUR ROUTE WISELY 

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		String way1;
		 String option1;
		 String eat, cabi,room, door, light;
		
		
		 Scanner in = new Scanner(System.in);
		 
		 for (int i=0 ; i < 2 ; i++)
		 {
			 
		 System.out.println("Where would you like to go- upstairs or kitchen?");
		 way1 = in.next();
		 
		 if (way1.equals("upstairs"))
		 {
			 System.out.println("You are headed upstairs- be careful!");
		 
			 System.out.println("You see a hallway with a bedroom and a bathroom- SElect one");

			 room = in.next();
			 
               if (room.equals("bedroom"))
				 
			 {
				 System.out.println("ohh the floors creeking !!");
			 
				 
				 System.out.println("What an amazing place with great wooden furniture- Do you want to open closet door- Y or N ");
					
							 
				door=in.next();
				
				 if (door.equals("Y"))
					 System.out.println("Looks dark and scary in here");
				 
				 else if (door.equals("N"))
					 System.out.println("Closet might be the place for ghosts to hide- but i guess you will never know");
				 
				 else 
					 System.out.println("You either open the door or not : select Y or N");
			 }
		 
               else if (room.equals("bathroom"))
               {
            	   System.out.println("need to go to the bathroom?");
  			 
				 
				 System.out.println(" Somethings shining in the dark, turn on lights- Y or N ");
					
							 
				light=in.next();
				
				 if (light.equals("Y"))
					 System.out.println("Ohh it was just reflection on mirror");
				 
				 else if (light.equals("N"))
					 System.out.println("Just run and hide");
				 
				 else 
					 System.out.println("You either turn on lights or not : select Y or N");
               }		 
		 
		 }
		 
		 else if (way1.equals("kitchen"))
		 {
			 System.out.println("Enter Kitchen with caution ");
		
			 System.out.println("Open one of the two mysterious objects:cabinet or fridge ");
			option1=in.next();
			 
			 if (option1.equals("fridge"))
				 
			 {
				 System.out.println("ohh there seems to be chemicals in the fridge !!");
			 
				 
				 System.out.println("Ohh no its just some nasty food: Would you eat it: Y or N ");
					
							 
				eat=in.next();
				
				 if (eat.equals("Y"))
					 System.out.println("Better be risk worth taking");
				 
				 else if (eat.equals("N"))
					 System.out.println("You will die of starvation");
				 
				 else 
					 System.out.println("You either have or not have food: select Y or N");
			 }
				 
			 else if (option1.equals("cabinet"))
			 {	 
			        System.out.println("Spider jumps on you, run!");
			        
			        System.out.println("Ohh no its just some old piece of paper: Would you read it: Y or N ");
					
					cabi=in.next();
					
					 if (cabi.equals("Y"))
						 System.out.println("You just found a treasure map");
					 
					 else if (cabi.equals("N"))
						 System.out.println(" Was just some old piece of paper anyway!");
					 else 
						 System.out.println("You either read or not have read: select Y or N");
			 }
			 else
			 System.out.println("Looks safe in here");
		 } 
			 
		 else 
			 System.out.println("No way- Deadend");
		 
		 
		 }
		 
			 
	}

}
