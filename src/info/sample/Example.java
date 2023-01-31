package info.sample;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		Map<String, String> h = new Hashtable<>();

		h.put("Vel", "Selenium");
		h.put("Ganesh", "Framework");
		h.put("Dinesh", "Oracle");
		h.put("Venkat", "CoreJava");
		h.put("Subash", "Html");
		System.out.println(h);
		Set<String> keys = h.keySet();
		System.out.println("\nValues of the Keys" + keys);
		System.out.println("\nIterating the Keys");
		for (String x : keys) {
			System.out.println(x);
		}
		Collection<String> values = h.values();
		System.out.println("\nValues from the Map" + values);
		System.out.println("\nIterating the Values");
		for (String y : values) {
			System.out.println(y);
		}
		System.out.println("\nIterating Combination of Keys and Values");
		Set<Entry<String, String>> e = h.entrySet();
		for (Entry<String, String> entry : e) {
			System.out.println(entry);
			String k = entry.getKey();
			System.out.println("Key :" + k);
			String v = entry.getValue();
			System.out.println("Value :" + v);
		}
	}
}
