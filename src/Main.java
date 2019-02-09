import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String testStr = " this    SENTENCE   should  be reTurned LOwer Camel CASE      ";

		System.out.println("input:\n" + testStr);
		System.out.println("\noutput:\n" + toCamelCase(testStr));

		/*
		 * Random rand = new Random(); int howManyCaves = rand.nextInt(9) + 1;
		 * int howManyFlashlights = rand.nextInt(3) + 1; int[] caves = new
		 * int[howManyCaves]; int[] flashlights = new int[howManyFlashlights];
		 * for (int i = 0; i < caves.length; i++) caves[i] = rand.nextInt(8) +
		 * 1; for (int i = 0; i < flashlights.length; i++) caves[i] =
		 * rand.nextInt(999999) + 1; System.out.println("\n\nCaves: " +
		 * Arrays.toString(caves)); System.out.println("Flashlights: " +
		 * Arrays.toString(flashlights));
		 * 
		 * System.out.println("\nI have " + howManyCaves +
		 * "caves to search and " + howManyFlashlights + "to do it with");
		 * System.out.println("I have found " + treasureHunt(caves, flashlights)
		 * + " treasure chests!");
		 */
	}

	// public static int treasureHunt(int[] caves, int[] flashlights) {
	// return 0;
	//
	// }
	// public static boolean searchCave(int caves, int flashlights) {
	// }

	public static String toCamelCase(String str) {
		str = str.trim().replaceAll("\\s+", " ");
		String[] words = str.split(" ");

		return makeWordsCamelCase(words, "", 0);
	}

	private static String makeWordsCamelCase(String[] words, String camelCaseStr, int counter) {
		if (counter == words.length) {
			return camelCaseStr;
		}

		if (counter == 0) {
			String firstWord = words[counter].toLowerCase();
			counter++;
			return makeWordsCamelCase(words, firstWord, counter);
		}

		String word = words[counter].toLowerCase();
		camelCaseStr += word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
		
		counter++;
		return makeWordsCamelCase(words, camelCaseStr, counter);
	}

}