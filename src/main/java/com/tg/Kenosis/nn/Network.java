package com.tg.Kenosis.nn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Network {
	//factory
	HexlinearFacory Factory = new HexlinearFacory();
	
	//variable of neurons
	static List<List<Double>> a = new ArrayList<List<Double>>();
	static List<Double> k = new ArrayList<Double>();
	static List<Double> b = new ArrayList<Double>();
    
    //instance of neurons
	static List<Neuron> n = new ArrayList<Neuron>();

	HashMap<Integer, Layer> layermap = new HashMap<Integer, Layer>();
	
	//Layer instance
	public Layer l1 = new Layer(2,2);
	public Layer l2 = new Layer(2,2);
	
	
	//test interface
	public int showNet() {
		return n.size();
	}
	
	
	/**
	 * Layer constructor
	 * Calculate function
	 * @author tg
	 *
	 */
	public class Layer{
		int startn;
		int nextstartn;
		
		public Layer(int input, int count){
			startn = n.size();
			for(int i=0; i<count; i++) {
				n.add(Factory.createNeuron(input));
				a.add(Factory.createParametera(input));
				k.add(Factory.createParameterk());
				b.add(Factory.createParameterb());
		}
			layermap.put(startn+1, this);
			nextstartn = n.size()-1;
		}
		
		public ArrayList<Double> Calculate(ArrayList<Double> input) {
			
			ArrayList<Double> output = new ArrayList<Double>();
			
			for(int i= startn; i<nextstartn+1; i++) {
			   n.get(i).sumUp(input, a.get(i));
			   
			   output.add(n.get(i).activate(b.get(i),k.get(i)));
		}
			return output;

	
}
}
}


