package personandsubclasses;
import java.util.*;
public class Person {
	
	public String name;
	public String address;
	Scanner sc=new Scanner(System.in);
	public String getAddress()
	{
		return address;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address){
		
		this.address=address;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "person namr="+name+"address="+address;
	}
	
}
