import java.util.Scanner;

public class StringWork {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        System.out.print("\nFound: ");
        int theCount = 0;
        boolean andFound = false;
        for (String word: words) {
            if (word.toLowerCase().contains("apple") || word.toLowerCase().contains("banana") || word.toLowerCase().contains("cherry")) {
                System.out.print(word + " ");
            }
            if (word.toLowerCase().equals("the")) {
                theCount++;
            }
            if (word.toLowerCase().equals("and")) {
                andFound = true;
            }
        }
        System.out.println("\nThe: \"The\" apears " + theCount + " time(s)");
        if (andFound) {
            System.out.println("And: \"And\" appears");
        } else {
            System.out.println("And: \"And\" does not appear");
        }
        System.out.print("Reverse: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        scanner.close();
    }
}
