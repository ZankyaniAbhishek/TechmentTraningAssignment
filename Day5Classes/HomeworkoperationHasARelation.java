package com.Techment.Day6Classes;

class Car
{
	String name;
	String model;
	Engine engine;
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	void displayAll() {
		System.out.println();
		System.out.println("Car's Name is :" + name);
		System.out.println("Car's Model is :" + model);
		System.out.println("Car's Engine Id is :" + engine.engineId);
		System.out.println("Car's Engine Type is :" + engine.engineType);
		System.out.println();
	}
}

class Engine
{
	int engineId;
	String engineType;
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
	
}
public class HomeworkoperationHasARelation {

	public static void main(String[] args) {
		Engine engine = new Engine(141, "Petrol");
		Car car = new Car("XUV", "Thar", engine);
		car.displayAll();
		// TODO Auto-generated method stub

		
	}

}
