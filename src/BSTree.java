// Mason Skoglund, CIS 261, Construct a program that
// creates and prints the data in a binary search tree.

public class BSTree {
    public BSTNode root;

    //Constructor
    public BSTree () {
        root = null;
    }

    //Add node to BST
    public void addNode(int data) {
        BSTNode newNode = new BSTNode(data);

        //if tree is empty
        if (root == null) {
            root = newNode;
            return;
        }

        BSTNode current = root;
        boolean inserted = false;

        while (!inserted) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    inserted = true;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    inserted = true;
                } else {
                    current = current.right;
                }
            }
        }
    }

    //call traversal methods
    public void printTree() {
        System.out.println("\nPreorder Traversal");
        preorderPrint(root);

        System.out.println("\nInorder Traversal:");
        inorderPrint(root);

        System.out.println("\nPostorder Traversal:");
        postorderPrint(root);
    }
    // Preorder: Root → Left → Right
    public void preorderPrint(BSTNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderPrint(node.left);
            preorderPrint(node.right);
        }
    }

    // Inorder: Left → Root → Right
    public void inorderPrint(BSTNode node) {
        if (node != null) {
            inorderPrint(node.left);
            System.out.print(node.data + " ");
            inorderPrint(node.right);
        }
    }

    // Postorder: Left → Right → Root
    public void postorderPrint(BSTNode node) {
        if (node != null) {
            postorderPrint(node.left);
            postorderPrint(node.right);
            System.out.print(node.data + " ");
        }
    }
}
