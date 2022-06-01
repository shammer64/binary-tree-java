package com.shammer.coaching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    private MyBinaryTree tree;

    @BeforeEach
    public void setup() {
        tree = new MyBinaryTree();
    }

    @Test
    public void emptyTreeHasSizeZero() {
        assertEquals(0, tree.size());
    }

    @Test
    public void emptyTreeShouldContainNullValue() {
        assertNull(tree.getValue());
    }

    @Test
    public void treeWithOneValueInsertedShouldBeSizeOne() {
        tree.insert(16);

        assertEquals(1, tree.size());
        assertEquals(16, tree.getValue());
        assertTrue(tree.contains(16));
    }

    @Test
    public void treeWithTwoValuesInsertedInOrderShouldBeSizeTwo() {
        tree.insert(16);
        tree.insert(28);

        assertEquals(2, tree.size());
        assertEquals(16, tree.getValue());
        assertTrue(tree.contains(16));
        assertTrue(tree.contains(28));
    }

    @Test
    public void treeWithTwoValuesInsertedReverseOrderShouldBeSizeTwo() {
        tree.insert(28);
        tree.insert(16);

        assertEquals(2, tree.size());
        assertEquals(28, tree.getValue());
        assertTrue(tree.contains(28));
        assertTrue(tree.contains(16));
    }

    @Test
    public void treeWithThreeValuesInsertedShouldBeSizeThree() {
        tree.insert(28);
        tree.insert(16);
        tree.insert(42);

        assertEquals(3, tree.size());
        assertEquals(28, tree.getValue());
        assertTrue(tree.contains(28));
        assertTrue(tree.contains(16));
        assertTrue(tree.contains(42));
    }

    @Test
    public void treeWithFourValuesInsertedShouldBeSizeFour() {
        tree.insert(28);
        tree.insert(16);
        tree.insert(42);
        tree.insert(8);

        assertEquals(4, tree.size());
        assertEquals(28, tree.getValue());
        assertTrue(tree.contains(28));
        assertTrue(tree.contains(16));
        assertTrue(tree.contains(42));
        assertTrue(tree.contains(8));
    }

    @Test
    public void treeWithFourValuesInsertedShouldBeSizeFour2() {
        tree.insert(28);
        tree.insert(16);
        tree.insert(42);
        tree.insert(22);

        assertEquals(4, tree.size());
        assertEquals(28, tree.getValue());
        assertTrue(tree.contains(28));
        assertTrue(tree.contains(16));
        assertTrue(tree.contains(42));
        assertTrue(tree.contains(22));
    }

}
