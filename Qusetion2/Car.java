
import java.util.*;
public class Car{
	String platenumber;
	Date manufactured;

	public  Car(String platenumber, Date manufactured){
		this.platenumber=platenumber;
		this.manufactured=manufactured;

	}
	public String display(){
		System.out.println(platenumber);
		System.out.println(manufactured);
		return null;

	}
}