
public class customer {
	private String CustomerN;
	int time; 
	private String Food;
	
	public customer(String FoodItem, int min, String Name){
		CustomerN = Name;
		 time = min;
		 Food = FoodItem;		
	}
	public String getFoodItem(){
		return Food;
	}
	public int getTime(){
		return time;
	}
	public String getName(){
		return CustomerN;
	}
}
