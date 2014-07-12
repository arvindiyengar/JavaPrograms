import java.io.*;
import java.util.*;

class Mobile
{
	private String name;
	private String model;
	private double cost;
	private String color;
	private String memory;
	

	Mobile()
	{
		name = null;
		model = null;
		cost = 0;
		color = null;
		memory = null;
	}

	Mobile(String name, String model)
	{
		this(15000,"BLUE","2GB");
		this.name = name;
		this.model = model;
		
	}
	
	Mobile(double cost, String color, String memory)
	{
		this.cost = cost;
		this.color = color;
		this.memory = memory;
	}

	Mobile(String name, String model, double cost, String color, String memory)
	{
		this.name = name;
		this.model = model;
		this.cost = cost;
		this.color = color;
		this.memory = memory;		
	}

	void display()
	{
		System.out.println("\nMobile Details: ");
		System.out.println("Name: " + name);
		System.out.println("Model: " + model);
		System.out.println("Cost: Rs." + cost);
		System.out.println("Color: " + color);
		System.out.println("Memory: " + memory);
	}
	
}

class Ex1
{
	public static void main(String[] arg)
	{
		System.out.println("\nDefault Constructor: ");
		Mobile a = new Mobile();
		a.display();

		System.out.println("\nConstructor with TWO Parameters: ");
		Mobile b = new Mobile("SonyEricson","K810i");
		b.display();

		System.out.println("\nConstructor with FIVE Parameters: ");
		Mobile c = new Mobile("Nokia","1100",2500,"Brown","64KB");
		c.display();
	}
}
