package huffman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author Snorre
 */
public class EncoderDecoder {

    public EncoderDecoder() {

    }

    public HuffmanEncodedResult encode(String filename) throws IOException {

        String data = readFromFile(filename);
        HashMap<Character, Integer> frequenciesMap = countFrequencies(data);
        Node root = createHuffmanTree(frequenciesMap);
        HashMap<Character, String> huffmanCodesMap = createHuffmanCodes(root);

        return new HuffmanEncodedResult(generateEncodedData(data, huffmanCodesMap), root);
    }

    /**
     * Decodes a huffman encoded message
     *
     * @param result the encoded result of type HuffmanEncodedResult
     * @return the decoded message
     */
    public String decode(HuffmanEncodedResult result) {

        StringBuilder stringBuilder = new StringBuilder();
        Node current = result.getRoot();
        int i = 0;

        while (i < result.getEncodedData().length()) {

            while (!current.isLeaf()) {
                char bit = result.getEncodedData().charAt(i);
                if (bit == '1') {
                    current = current.getRightChild();
                } else if (bit == '0') {
                    current = current.getLeftChild();
                } else {
                    throw new IllegalArgumentException("Invalid bit in message");
                }
                i++;
            }
            stringBuilder.append(current.getCharacter());
            current = result.getRoot();
        }

        return stringBuilder.toString();
    }

    /**
     *
     * @param data
     * @param huffmanCodesMap
     * @return a string of all the huffman codes (It will look something like
     * this: 110100110110100101)
     */
    public String generateEncodedData(String data, HashMap<Character, String> huffmanCodesMap) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : data.toCharArray()) {
            stringBuilder.append(huffmanCodesMap.get(character));
        }
        return stringBuilder.toString();
    }

    /**
     * Takes the string returned from readFromFile and counts how many times
     * each character occurs in the string. Each character is stored in a
     * hashmap as the key and each character's frequency is stored in the
     * respective value in the hashmap. Prints out each character and its
     * respective frequency.
     *
     * @param data
     * @return
     * @throws IOException
     */
    public HashMap countFrequencies(String data) throws IOException {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : data.toCharArray()) {
            Set<Character> set = frequencyMap.keySet();
            for (Character setChar : set) {
                if (setChar.equals(character)) {
                    frequencyMap.put(character, frequencyMap.get(character) + 1);
                }
            }
            if (!frequencyMap.containsKey(character)) {
                frequencyMap.put(character, 1);
            }
        }

        // Prints out each character and their frequency.
        System.out.println("The content of the frequency HashMap:");
        System.out.println("Left shows each character represented in the"
                + "text file, while right side represents the frequency of"
                + "the respecitve character");
        for (Character name : frequencyMap.keySet()) {
            char key = name;
            int value = frequencyMap.get(key);
            System.out.println(key + " " + value);
        }
        return frequencyMap;
    }

    /**
     *
     * @param freqMap
     * @return
     */
    public Node createHuffmanTree(HashMap<Character, Integer> freqMap) {

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        // Create a leaf node for each character in the hashmap.
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }

        if (priorityQueue.size() == 1) {
            System.out.println("There is no reason to create a huffman tree using"
                    + "only one character");
        }

        while (priorityQueue.size() > 1) {
            Node leftNode = priorityQueue.poll();
            Node rightNode = priorityQueue.poll();
            // Create a parent node from the left + right node. The '\0'
            // character indicates that this is not a leaf node, but a parent node.
            Node parent = new Node('\0', leftNode.getFrequency() + rightNode.getFrequency(), leftNode, rightNode);
            priorityQueue.add(parent);
        }
        return priorityQueue.poll();
    }

    /**
     * Create
     *
     * @param root
     * @return a hashmap with caharacters as keys and the encoded string that
     * contains bits that represent the respective character.
     */
    public HashMap<Character, String> createHuffmanCodes(Node root) {

        HashMap<Character, String> huffmanCodesMap = new HashMap<>();

        // Helper method that will call itself recursively.
        createHuffmanCodesHelper(root, "", huffmanCodesMap);

        return huffmanCodesMap;
    }

    /**
     *
     * @param node
     * @param s
     * @param huffmanCodes
     */
    private void createHuffmanCodesHelper(Node node, String s, HashMap<Character, String> huffmanCodes) {
        if (!node.isLeaf()) {
            createHuffmanCodesHelper(node.getLeftChild(), s + '0', huffmanCodes);
            createHuffmanCodesHelper(node.getRightChild(), s + '1', huffmanCodes);
        } else {
            huffmanCodes.put(node.getCharacter(), s);
        }
    }

    /**
     *
     * @param filename
     * @return the text content of the file as a string.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String readFromFile(String filename) throws FileNotFoundException, IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            StringBuilder stringBuilder = new StringBuilder();

            // Reads the first line from filename.
            String line = bufferedReader.readLine();

            while (line != null) {
                // Adds the first line to stringBuilder.
                stringBuilder.append(line);
                // Adds a line feed or carriage return to the string builder.
                stringBuilder.append(System.lineSeparator());
                // Reads the next line from filename. 
                line = bufferedReader.readLine();
            }
            return (stringBuilder.toString());

        }

    }
}
