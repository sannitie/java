package huffman;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Snorre
 */
public class Huffman {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        EncoderDecoder myEncoderDecoder = new EncoderDecoder();
        HuffmanEncodedResult result = myEncoderDecoder.encode("terjevigen.txt");
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Encoded message: \n" + result.getEncodedData());
        System.out.println("----------------------------------------------------------");
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Decoded message: \n \n" + myEncoderDecoder.decode(result));
        System.out.println("----------------------------------------------------------\n");
    }

}
