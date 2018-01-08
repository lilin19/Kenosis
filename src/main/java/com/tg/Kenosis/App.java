package com.tg.Kenosis;

import java.util.ArrayList;

import com.tg.Kenosis.nn.*;;
public class App {
	public static Network net = new Network();

	
	public static void main(String[] args) {
		ArrayList<Double> input = new ArrayList<Double>(2);
		input.add(1.0);
		input.add(1.0);
		System.out.println(net.l2.Calculate(net.l1.Calculate(input)));

	}
	
	
	
}
