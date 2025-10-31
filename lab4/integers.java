import java.util.Scanner;

public class integers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        String ints = s.nextLine();
        String divby3 = "";
        int evens = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int num;
        String[] arr = ints.split(" ");

        for (String i : arr) {
            num = Integer.parseInt(i);

            if (num % 3 == 0) {
                divby3 += num + ", ";
            }

            if (num % 2 == 0) {
                evens++;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
        }
        System.out.println("\n" + divby3 + "are divisible by 3.");
        System.out.println("There are " + evens + " even numbers.");
        System.out.println("Minimun = "+ min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)(sum) / 10);
        System.out.println("Largest's digits: ");
        while (max > 0) {
            System.out.println(max % 10 + " ");
            max /= 10;
        }
        s.close();
    }
}