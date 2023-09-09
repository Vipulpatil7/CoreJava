package collectionex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowelsHashSet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase to handle both cases

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (vowels.contains(c)) {
                    vowelCount++;
                    vowels.remove(c); // Remove from the set to avoid duplicate counting
                } else {
                    consonantCount++;
                    
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
		
	

}
