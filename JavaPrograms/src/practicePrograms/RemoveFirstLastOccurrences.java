package practicePrograms;

import java.util.Scanner;

public class RemoveFirstLastOccurrences {
    public static String removeFirstLastChar(String input, char target) {
        int firstIndex = input.indexOf(target);
        int lastIndex = input.lastIndexOf(target);

        if (firstIndex == -1 || firstIndex == lastIndex) {
            
            return input;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i != firstIndex && i != lastIndex) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char target = scanner.next().charAt(0);

        String modifiedString = removeFirstLastChar(input, target);

        System.out.println("Original string: " + input);
        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}


