import java.util.*;

abstract class Vehicle 
{
	int year_of_manfacture;
	public abstract void getData();
	public abstract void putData();
}

class TwoWheeler extends Vehicle 
{
	protected String brand;
	protected int cost;
	String EngineType;
	public String color;
	Scanner s;
	public void getData() 
	{
		
			s = new Scanner(System.in);
			 System.out.println("Enter Brand of TwoWheeler:");
			 brand=s.next();
			System.out.println("Enter Cost of TwoWheeler");
			cost = Integer.parseInt(s.next());
			System.out.println("Enter Engine Type TwoWheeler (2_Stroke or 4_ Stroke)");
			EngineType = s.next();
			System.out.println("Enter Color of TwoWheeler");
			color = s.next();
	}

	public void putData() 
	{
		System.out.println("TWO WHEELER\nBrand:" + brand + "\nEngineType: "
				+ EngineType + "\nCost:" + cost + "\nColor:" + color+"\n\n");
	}
}

final class FourWheeler extends Vehicle 
{
	private String brand;
	protected int cost;
	String EngineType;
	public String color;
    	Scanner s;
	public void getData() 
	{
			s = new Scanner(System.in);
			 System.out.println("Enter Brand of FourWheeler:");
			 brand=s.next();
			System.out.println("Enter Cost of FourWheeler");
			cost = Integer.parseInt(s.next());
			System.out.println("Enter Engine Type of FourWheeler (2_Stroke or 4_Stroke)");
			EngineType = s.next();
			System.out.println("Enter Color of FourWheeler");
			color = s.next();
	}
	public void putData() 
	{
		System.out.println("FOUR WHEELER\nBrand:" + brand + "\nEngineType: "
				+ EngineType + "\nCost:" + cost + "\nColor:" + color+"\n\n");
	}
}
class MyTwoWheeler extends TwoWheeler 
{
	String OwnerName;
	MyTwoWheeler(String ow,String br, int co, String et, String colo) 
	{
		OwnerName = ow;
		super.brand=br;
		super.cost = co;
		super.EngineType = et;
		super.color = colo;
	}

	public void prin() 
	{
		System.out.println("The Vehicle \nBrand:"+super.brand+"\nEngineType:" + super.EngineType + "\nCost:" + super.cost + "\nColor: " 	+ super.color);
		System.out.println("Owner:" + OwnerName);
	}
}

class first 
{
	public static void main(String args[]) 
	{
		TwoWheeler tw = new TwoWheeler();
		tw.getData();
		tw.putData();
		FourWheeler fw=new FourWheeler();
		fw.getData();
		fw.putData();
		MyTwoWheeler mt = new MyTwoWheeler("Ramesh","Bajaj",50000, "2 Stroke", "Red");
		mt.prin();
	}
}

