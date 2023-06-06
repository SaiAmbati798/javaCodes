/*
 * program : Area of circle using class and objects
 * @author Saikumar
 * 
 * @since 31/05/2023
 * 
 * @version jdk11
 * 
 * */
package com.classesobjectsencapsulation;
class Circle{
	private double radius;
	private String color;
	Circle(){
		radius=1.0;
		color="red";
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class AreaOfCircle {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(15);
		c1.setColor("Yellow");
		System.out.println(c1.getColor());
		System.out.println(c1.getRadius());
		Circle c2=new Circle(5);
		System.out.println(c2);
		Circle c3=new Circle(6,"green");
		System.out.println(c3);
		System.out.println(c3.getArea());
		
		
	}
}
