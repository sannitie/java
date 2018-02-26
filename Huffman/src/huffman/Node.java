package huffman;

/**
 *
 * @author Snorre
 */
public class Node implements Comparable<Node>{
    
    private char character;
    private int frequency;
    private Node leftChild;
    private Node rightChild;
    
    public Node (char character, int frequency, Node leftChild, Node rightChild) {
        this.character = character;
        this.frequency = frequency;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }

    @Override
    public int compareTo(Node o) {
        int frequencyComparison = Integer.compare(this.frequency, o.frequency);
        if (frequencyComparison != 0) {
            return frequencyComparison;
        } 
        return Integer.compare(this.character, o.character);
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    
}
