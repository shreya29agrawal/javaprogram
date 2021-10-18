package javaCollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequencyCount {

	public static void frequencyCount(String str) {

		System.out.println(str);
		str = str.replaceAll(" ", "");

		Map freqCount = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			if (freqCount.containsKey(ch)) {
				freqCount.put(ch, (Integer) freqCount.get(ch) + 1);

			} else
				freqCount.put(ch, 1);

		}

		System.out.println(freqCount);

	}

	public static void main(String args[]) {

		CharFrequencyCount fc = new CharFrequencyCount();
		fc.frequencyCount("this is the world of hell");

	}

}
