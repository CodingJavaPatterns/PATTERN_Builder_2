package com.antonromanov.patterns.samples.builder2;

public class CarBuilderDirector {
	
	private final BaseCarBuilder baseCarBuilder;
	
	 public CarBuilderDirector(BaseCarBuilder baseCarBuilder) {
	        this.baseCarBuilder = baseCarBuilder;
	    }
	

	 public void construct() {
	        this.baseCarBuilder.buildBody();
	        this.baseCarBuilder.buildColor();
	    }
	 
}
