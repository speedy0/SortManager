package com.sparta.an.sortingAlgorithms.binaryTree;

import com.sparta.an.sortingAlgorithms.Sorter;

public class BinaryTree implements Sorter, BinaryTreeImpl{
    @Override
    public int[] sort(int[] array) {
        addElements(array);
        getSortedTreeAsc(array);
        return array;
    }

    public class Node {
        private final int val;
        private Node leftChild;
        private Node rightChild;

        public Node(int val) {
            this.val = val;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public int getVal() {
            return val;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public boolean isLeftChildEmpty(){
            return leftChild == null;
        }

        public boolean isRightChildEmpty(){
            return rightChild == null;
        }
    }

    private final Node rootNode;

    public BinaryTree(int elements) {
        rootNode = new Node(elements);
    }

    private void addElementToTree(final int element){
        addNodeToTree(rootNode, element);
    }

    private void addNodeToTree(Node node, int element){
        if (element < node.getVal()){
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getVal()) {
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getVal()){
                return node;
            }
            if(element < node.getVal()){
                node = node.getLeftChild();
            } else if (element > node.getVal()){
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getRootElement() {
        return rootNode.getVal();
    }

    @Override
    public int getNumberOfElements() {
        return countNodes(rootNode);
    }

    private int countNodes(Node node){
        int count = 1;
        if (node == null){
            return 0;
        }
        count = count + countNodes(node.getLeftChild()) + countNodes(node.getRightChild());
        return count;
    }

    @Override
    public void addElement(int element) {
        addElementToTree(element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements){
            addElementToTree(element);
            System.out.println(element + " added to the tree.");
        }
    }

    public boolean findElement(int element){
        Node node = findNode(element);
        return node != null;
    }

    @Override
    public int getLeftChild(int element) {
        Node node = findNode(element);
        return node.getLeftChild().getVal();
    }

    @Override
    public int getRightChild(int element) {
        Node node = findNode(element);
        return node.getRightChild().getVal();
    }

    @Override
    public int[] getSortedTreeAsc(int[] array) {
        int index = 0;
        getArraySorted(rootNode, array, index, "asc");
        return array;
    }

    @Override
    public int[] getSortedTreeDesc(int[] array) {
        int index = 0;
        getArraySorted(rootNode, array, index, "desc");
        return array;
    }

    private int getArraySorted(Node node, int[] array, int index, String order){
        if (node == null)
            return index;

        if (order == "asc"){
            index = getArraySorted(node.getLeftChild(), array, index, order);

            array[index] = node.getVal();
            index++;

            index = getArraySorted(node.getRightChild(), array, index, order);
        } else {
            index = getArraySorted(node.getRightChild(), array, index, order);

            array[index] = rootNode.getVal();
            index++;

            index = getArraySorted(rootNode.getLeftChild(), array, index, order);
        }

        return index;
    }
}
