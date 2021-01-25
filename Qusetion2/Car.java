/**
*on my honor, as a Rwanda polyytechnic /IPRC TUMA student ;
*I have neither given nor received unauthorized assistance on
*this work.
*@author{MUHIRWA David}
*Date January 25,2020
*/
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