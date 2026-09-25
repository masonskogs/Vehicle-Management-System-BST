// Mason Skoglund, CIS 261, Construct a program that
// creates and prints the data in a binary search tree.

public class BSTNode {
    public int data;
    public BSTNode left;
    public BSTNode right;

    //Constructor
    public BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
