// Binary tree class includes methods to construct a
// tree of ints, to print its structure, and  print the data
// using inorder  traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree, aka as "sequential trees."


public class IntTree {
    private IntTreeNode overallRoot;

    // Cnstruct a sequential tree with given number of nodes
    
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // Return a sequential tree with n as its root unless
    // n is greater than max, in which case it returns an empty tree
    
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max),
                                   buildTree(2 * n + 1, max));
        }
    }


    
    // Print the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

   

    // Print the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth, from right to left so that it looks
    //       correct when the output is rotated.
    
    public void printTree() {
        printTree(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printTree(IntTreeNode root, int level) {
        if (root != null) {
            printTree(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printTree(root.left, level + 1);
        }
    }
}