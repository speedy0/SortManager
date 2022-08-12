package com.sparta.an.sortingAlgorithms.binaryTree;

public interface BinaryTreeImpl {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element); //throws ChildNotFoundException;

    int getRightChild(int element); //throws ChildNotFoundException;

    int[] getSortedTreeAsc(int[] array);

    int[] getSortedTreeDesc(int[] array);
}
