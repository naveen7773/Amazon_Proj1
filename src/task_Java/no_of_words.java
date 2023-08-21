package task_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class no_of_words {

	public static void main(String[] args) {

		String input = "apple and apple";
		String[] array = input.split(" ");
		int length = array.length;
		System.out.println("number of words in the given string = " + length);

		// number of duplicate words in the given string

		String lower = input.toLowerCase();
		String[] lowerarray = lower.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		int count = 1;

		for (String word : lowerarray) {
			if (!map.containsKey(word)) {
				map.put(word, count);
			} else {

				count = map.get(word);
				map.put(word, count + 1);

			}
		}

		int duplicatecount = 0;
		for (int wordcount : map.values()) {// the map values is give the collection value and this assigns to wordcount
			if (wordcount > 1) {
				duplicatecount++;
			}

		}

		System.out.println("The number of duplicate words in the given string =" + duplicatecount);

		// 3.)Position of the duplicate words in the given string

		Map<String, Integer> mapposition = new HashMap<>();

		for (int i = 0; i < lowerarray.length; i++) {

			if (mapposition.containsKey(lowerarray[i])) {
				int previousposition = mapposition.get(lowerarray[i]);
				System.out.println(
						"Position of the Duplicate words in the string is " + (previousposition) + "," + (i + 1));
			} else {
				mapposition.put(lowerarray[i], i + 1);
			}

		}
	}
}
