package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public abstract class Person implements Basic {

	private String name;
	private double weight;
	private int health;
	
	public Person() {}
	
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", weight: " + weight + ", health: " + health;
	}
	
	//public abstract void eat();
	//public abstract void sleep();
}
