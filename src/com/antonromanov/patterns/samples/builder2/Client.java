package com.antonromanov.patterns.samples.builder2;

public class Client {

	public static void main(String[] args) {


		CarBuilderDirector director = null;   
        VolvoBuilder volvoBuilder = new VolvoBuilder();
        director = new CarBuilderDirector(volvoBuilder);
        director.construct();
        System.err.println(volvoBuilder.getCar().toString());
		

	}

}
