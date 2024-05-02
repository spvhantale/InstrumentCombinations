package com.swapnil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int payloadCap = 10;
		int volumeCap = 7;
		List<Instrument> instruments = new ArrayList<>();

		Instrument instrument1 = new Instrument(3, 2, 10);
		Instrument instrument2 = new Instrument(4, 3, 15);
		Instrument instrument3 = new Instrument(2, 1, 8);
		Instrument instrument4 = new Instrument(5, 4, 20);

		instruments.add(instrument1);
		instruments.add(instrument2);
		instruments.add(instrument3);
		instruments.add(instrument4);

		Collections.sort(instruments);

		int weightCount = 0;
		int volumeCount = 0;
		int maxScientificValue = 0;

		List<Instrument> combinations = new ArrayList<>();

		for (Instrument instrument : instruments) {

			if ((weightCount + instrument.getWeight() <= payloadCap)
					&& (volumeCount + instrument.getVolume() <= volumeCap)) {
				combinations.add(instrument);
				weightCount += instrument.getWeight();
				volumeCount += instrument.getVolume();
				maxScientificValue += instrument.getValue();
			}

		}

		System.out.println("Selected Combination of Instruments");

		for (Instrument instrument : combinations) {
			System.out.println(instrument);
		}

		System.out.println("Total Weight: " + weightCount + " kg");
		System.out.println("Total Volume: " + volumeCount + " m^3");
		System.out.println("Total Scientific Value: " + maxScientificValue);

	}

}
