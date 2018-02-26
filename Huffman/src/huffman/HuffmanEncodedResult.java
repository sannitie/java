package huffman;

/**
 *
 * @author Snorre
 */
public class HuffmanEncodedResult {
    
    String encodedData;
    Node root;
    
    
    HuffmanEncodedResult(String encodedData, Node root) {
        this.encodedData = encodedData;
        this.root = root;
    }

    public String getEncodedData() {
        return encodedData;
    }

    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
}
