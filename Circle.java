package com.Interfaces;

public class Circle implements Shape {

	double radius = 7;
    public double area() {
        return Math.PI * radius * radius;
    }
	
}
