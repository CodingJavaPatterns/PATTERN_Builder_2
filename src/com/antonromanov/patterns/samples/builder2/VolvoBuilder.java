package com.antonromanov.patterns.samples.builder2;

public class VolvoBuilder implements BaseCarBuilder {
	
	private Car car;

    public VolvoBuilder() {
        car = new Car("Volvo");
    }

	@Override
	public void buildBody() {
		 car.setBody(Car.Body.LIMOUSINE);
		
	}

	@Override
	public void buildColor() {
		 car.setColor(Car.Color.BLACK);
		
	}
    
	 public Car getCar() {
	        return car;
	    }
    

}
