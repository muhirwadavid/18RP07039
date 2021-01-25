import java.util.*;

public class Car{

 int count;
 String name;
 Engine engine;
 Wheel wheel;
 FluffyDice fluffyDice;

public Car(){
	System.out.println(count);

}
public String car(String name,Engine engine,Wheel wheel){

this.name=name;
this.engine=engine;
this.wheel=wheel;

System.out.println(name);
System.out.println(Engine.engine);
System.out.println(Wheel.wheel);

}


}