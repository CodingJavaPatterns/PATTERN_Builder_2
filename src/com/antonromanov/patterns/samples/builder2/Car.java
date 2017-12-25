package com.antonromanov.patterns.samples.builder2;

public class Car {
	
	enum Color {RED, BLACK, WHITE}

    enum Body {SEDAN, CABRIOLET, LIMOUSINE}	
    
    
    private Body body;
    private Color color;
    private String name;
    
    
    public Car(String name) {
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", color=" + color +
                ", name='" + name + '\'' +
                '}';
    }   

}
