package com.tg.Kenosis.nn;
import java.util.ArrayList;
public abstract class NeuronFactory {
	abstract Neuron createNeuron(int input);
	abstract ArrayList<Double> createParametera(int input);
}

class HexlinearFacory extends NeuronFactory{

	public Hexlinear createNeuron(int input) {
		 
		 return new Hexlinear(); 
		 
	}

	public ArrayList<Double> createParametera(int input) {
		ArrayList<Double> a =  new ArrayList<Double>();
			for(int i=0; i<input; i++) {
				a.add((double) 1);
		}
	    return a;
	}
	
	public Double createParameterk() {
		double k = 1;
		return k;
	}
	
	public Double createParameterb() {
		double b = 1;
		return b;
	}

	
}