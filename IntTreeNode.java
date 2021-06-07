// Class for a single node of a binary tree of ints

public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
                
    // construct a leaf node (no subtrees) with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                        
    // construct a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left, 
                       IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}