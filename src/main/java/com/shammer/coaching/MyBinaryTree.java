package com.shammer.coaching;

public class MyBinaryTree {
    private Integer value;
    private MyBinaryTree left;
    private MyBinaryTree right;

    public int size() {
        if (value == null) return 0;
        return 1 +
                (right == null ? 0 : right.size()) +
                (left == null ? 0 : left.size());
    }

    public Integer getValue() {
        return value;
    }

    public void insert(int value) {
        if (this.value == null) {
            this.value = value;
        } else if (this.value < value) {
            if (right == null)
                right = new MyBinaryTree();
            right.insert(value);
        } else {
            if (left == null)
                left = new MyBinaryTree();
            left.insert(value);
        }
    }

    public boolean contains(int value) {
        return (this.value != null && this.value.equals(value)) ||
                (right != null && right.contains(value)) ||
                (left != null && left.contains(value));
    }

    public int depth() {
        return value == null ? 0 : 1 + Math.max(
            (right == null ? 0 : right.depth()),
            (left == null ? 0 : left.depth())
        );
    }
}
