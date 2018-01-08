package com.tg.Kenosis.nn;

import java.util.List;

/*
 * author:Tg
 */
interface Neuron {
	double sumUp(List<Double> input, List<Double> paraSum);
	double activate(double offset,double slope);
}


/*
 * the linear neuron
 */
class Hexlinear implements Neuron{
	 double sum;
	 double y;
		/**
		 * Activate function
		 * @output of neuron
		 */

	public double activate(double offset, double slope) {
		y = sum*slope + offset;
		return y;
	}

	 /*
	  * Sum-up function
	  * Sum changes
	  */
	public double sumUp(List<Double> x, List<Double> paraSum) {
		sum = 0;
     for(int i=0; i<x.size(); i++) {
    	 sum += paraSum.get(i) * x.get(i);
	}
	return sum;

}
}