package tree;

public class AVL {

    // Inner class for the tree node
    public class Node {
        private int value;
        private Node right;
        private Node left;
        private int height;

        public Node(int value) {
            this.value = value;
            // A new node is initially added at a leaf, so its height is 0
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
        // Constructor is empty, root is null by default
    }

    // Returns the height of a node, -1 for null nodes
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Public wrapper to get the height of the entire tree
    public int height() {
        return height(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Public wrapper for inserting a value
    public void insert(int value) {
        root = insert(root, value);
    }

    // Recursive insert method
    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.left = insert(node.left, value);
        } else if (value > node.getValue()) {
            node.right = insert(node.right, value);
        } else {
            // Duplicate values are not allowed in this implementation
            return node;
        }

        // Update height and perform rotations
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    // Performs rotations if the node is unbalanced
    private Node rotate(Node node) {
        // Case 1: Left heavy
        if (height(node.left) - height(node.right) > 1) {
            // Left-Left Case
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node);
            }
            // Left-Right Case
            if (height(node.left.left) < height(node.left.right)) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Case 2: Right heavy
        if (height(node.left) - height(node.right) < -1) {
            // Right-Right Case
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node);
            }
            // Right-Left Case
            if (height(node.right.right) < height(node.right.left)) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // Performs a left rotation
    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    // Performs a right rotation
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length -1);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = start + (end - start) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid - 1);
        populatedSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    // Traversal Methods
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}