// Mason Skoglund, CIS 261, Construct a program that
// creates and prints the data in a binary search tree.

import java.util.Scanner;

public class BSTDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BSTree tree = new BSTree();

        //Loop to get at least 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int value = scanner.nextInt();
            tree.addNode(value);
        }

        //Print tree traversals
        tree.printTree();

        scanner.close();
    }
}
