package com.swapnil;

public class Instrument implements Comparable<Instrument> {

	private int weight;
	private int volume;
	private int value;
	private double valueToweight;

	public Instrument(int weight, int volume, int value) {
		super();
		this.weight = weight;
		this.volume = volume;
		this.value = value;
		this.valueToweight = (double) value / weight;
	}

	public int getWeight() {
		return weight;
	}

	public int getVolume() {
		return volume;
	}

	public int getValue() {
		return value;
	}

	public double getValueToweight() {
		return valueToweight;
	}

	@Override
	public int compareTo(Instrument o) {

		int ratio=Double.compare(o.valueToweight, this.valueToweight);
		if(ratio==0) {
			return Integer.compare(o.value, this.value);
		}
		return ratio;
	}

	@Override
	public String toString() {
		return "Instrument:- weight= " + weight + " kg , volume= " + volume + " m^3 , value=" + value;
	}

}
