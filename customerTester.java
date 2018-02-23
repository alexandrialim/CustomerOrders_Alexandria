import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class customerTester {
	

	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		Queue<customer> line = new LinkedList<customer>();
		System.out.print("What would you like to Order: ");
		String Item = scn.next();
		System.out.print("Cook time: ");
		int t = scn.nextInt();
		System.out.print("What is your name?");
		String Name = scn.next();
		customer c = new customer(Item, t, Name);
		line.add(c);
		System.out.print("");
		int time = 0;
		while(line.size() > 0){
			System.out.println("Number of Items in Queue: " + line.size());
			System.out.println("Current order being prepared: " + line.element().getFoodItem());
			System.out.println("");
			System.out.print("Want to order anything else? Y / N ");
			String choice = scn.next();
			String food = null; 
			int min = 0;
			if(choice.equals("Y")){
				System.out.print("Food Item: ");
				food = scn.next();
				System.out.print("Cook Time: ");
				min = scn.nextInt();
				customer newItem = new customer(food, min, Name);
				line.add(newItem);
			}
			if(line.element().getTime() == time){
				System.out.println("");
				System.out.println("Order Complete: " + line.element().getFoodItem() + " for " + line.element().getName() + " is Done");
				System.out.println("");
				line.remove();
				time = 0;
			}
			else {
				System.out.println("");
				System.out.println("Wait time left for first order: " + (line.element().getTime() - time) + " min");
			}
			System.out.print("");
			time++;
		}
		System.out.println("No orders left in Queue");
	}
}
