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
    public void emptyTreeHasDepthZero() {
        assertEquals(0, tree.depth());
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
        assertEquals(1, tree.depth());
    }

    @Test
    public void treeWithTwoValuesInsertedInOrderShouldBeSizeTwo() {
        tree.insert(16);
        tree.insert(28);

        assertEquals(2, tree.size());
        assertEquals(16, tree.getValue());
        assertTrue(tree.contains(16));
        assertTrue(tree.contains(28));
        assertEquals(2, tree.depth());
    }

    @Test
    public void treeWithTwoValuesInsertedReverseOrderShouldBeSizeTwo() {
        tree.insert(28);
        tree.insert(16);

        assertEquals(2, tree.size());
        assertEquals(28, tree.getValue());
        assertTrue(tree.contains(28));
        assertTrue(tree.contains(16));
        assertEquals(2, tree.depth());
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
        assertEquals(2, tree.depth());
    }

    @Test
    public void treeWithFourValuesInsertedShouldBeSizeFour_LeftInsert() {
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
        assertEquals(3, tree.depth());
    }

    @Test
    public void treeWithFourValuesInsertedShouldBeSizeFour_RightInsert() {
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
        assertEquals(3, tree.depth());
    }

    @Test
    public void treeShouldHandleSeriesOfInserts() {
        assertEquals(0, tree.size());
        assertFalse(tree.contains(28));
        assertEquals(0, tree.depth());

        tree.insert(28);
        assertEquals(1, tree.size());
        assertTrue(tree.contains(28));
        assertEquals(1, tree.depth());

        tree.insert(19);
        assertEquals(2, tree.size());
        assertTrue(tree.contains(19));
        assertEquals(2, tree.depth());

        tree.insert(37);
        assertEquals(3, tree.size());
        assertTrue(tree.contains(37));
        assertEquals(2, tree.depth());

        tree.insert(48);
        assertEquals(4, tree.size());
        assertTrue(tree.contains(48));
        assertEquals(3, tree.depth());

        tree.insert(32);
        assertEquals(5, tree.size());
        assertTrue(tree.contains(32));
        assertEquals(3, tree.depth());

        tree.insert(9);
        assertEquals(6, tree.size());
        assertTrue(tree.contains(9));
        assertEquals(3, tree.depth());

        tree.insert(22);
        assertEquals(7, tree.size());
        assertTrue(tree.contains(22));
        assertEquals(3, tree.depth());

    }

}
