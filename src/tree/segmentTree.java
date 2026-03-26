package tree;

public class segmentTree {

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    /**
     * Constructs the segment tree from an input array.
     * @param arr The array of numbers to build the tree from.
     */
    public segmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    /**
     * Recursively constructs the tree.
     * @param arr The source array.
     * @param start The starting index of the current segment.
     * @param end The ending index of the current segment.
     * @return The newly created node representing the segment.
     */
    private Node constructTree(int[] arr, int start, int end) {
        // Base case: If start and end are the same, we are at a leaf node.
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // Create the current node for the interval [start, end].
        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        // Recursively build the left and right children.
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        // The data of an internal node is the sum of its children's data.
        node.data = node.left.data + node.right.data;
        return node;
    }

    /**
     * Public method to display the tree structure.
     */
    public void display() {
        System.out.println("--- Segment Tree ---");
        display(this.root, 0);
        System.out.println("--------------------");
    }

    /**
     * Helper method to display the tree with indentation for better readability.
     * @param node The current node to display.
     * @param level The current depth in the tree for indentation.
     */
    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        // Indent based on the level
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println("Interval=[" + node.startInterval + "-" + node.endInterval + "], Data=" + node.data);

        // Recursively display children
        display(node.left, level + 1);
        display(node.right, level + 1);
    }


    /**
     * Queries the sum of a given range.
     * @param qsi The start index of the query range.
     * @param qei The end index of the query range.
     * @return The sum of elements in the range [qsi, qei].
     */
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // Case 1: The node's interval is completely inside the query range.
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }
        // Case 2: The node's interval is completely outside the query range.
        else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0; // Return 0 for sum queries as it's the additive identity.
        }
        // Case 3: The node's interval partially overlaps with the query range.
        else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    /**
     * Updates a value at a specific index in the original array and propagates
     * the change up the tree.
     * @param index The index to update.
     * @param value The new value.
     */
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    /**
     * Helper method to perform the update recursively. This version is efficient (O(log N)).
     * @param node The current node in the recursion.
     * @param index The index to update.
     * @param value The new value.
     */
    private void update(Node node, int index, int value) {
        // Base case: We have reached the leaf node corresponding to the index.
        if (node.startInterval == index && node.endInterval == index) {
            node.data = value;
            return;
        }

        // If not a leaf, determine whether to go left or right.
        int mid = (node.startInterval + node.endInterval) / 2;
        if (index <= mid) {
            // Index is in the left child's interval.
            update(node.left, index, value);
        } else {
            // Index is in the right child's interval.
            update(node.right, index, value);
        }

        // After the child node is updated, recalculate the current node's data.
        node.data = node.left.data + node.right.data;
    }
}
