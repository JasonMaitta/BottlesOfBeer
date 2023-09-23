import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of bottles of beer to start with: ");
        int bottles = scanner.nextInt();

        for (int i = bottles; i >= 0; i--) {
            if (i == 0) {
                System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
                System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
            } else if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
            } else {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottle" + (i - 1 == 1 ? "" : "s") + " of beer on the wall.");
            }
        }
    }
}