package cs143.eelradie;

import java.util.*;
import java.io.*;

public class MorseConverter implements Converter {
	private HashMap<String, String> encoder = new HashMap<>();
	private HashMap<String, String> decoder = new HashMap<>();
	private String[] arr;
	String line = "";
	private BufferedReader input = null;
	private String encode = "";
	private String decode = "";
	private String[] arr2;
	private PrintStream output;

	public MorseConverter(String table) {
		try {
			input = new BufferedReader(new FileReader(table));
			while ((line = input.readLine()) != null) {
				arr = line.split(" ");
				encoder.put(arr[0], arr[1]);
				decoder.put(arr[1], arr[0]);

			}
			input.close();
		} catch (Exception e) {
		}

	}

	@Override
	public void printKeyValuePairs() {
		System.out.println("Encoder Key Value Pair:\n"+encoder);
		System.out.println("Decoder Key Value Pair:\n"+decoder);
	}

	@Override
	public String encode(String textToEncode) {
		arr = textToEncode.split(" ");
		for (String h : arr) {

			for (int x = 0; x < h.length(); x++) {
				String p = "" + h.charAt(x);
				if (encoder.containsKey(p.toLowerCase())) {
					String t = encoder.get(p.toLowerCase()) + " ";
					encode += t;

				}
			}
			encode += " ";
		}

		return encode;

	}

	@Override
	public String decode(String textToDecode) {

		arr = textToDecode.split("  ");
		for (String h : arr) {
			arr2 = h.split(" ");
			for (String t : arr2) {
				if (decoder.containsKey(t)) {
					decode += decoder.get(t);
				}
			}
			decode += " ";
		}

		return decode;
	}

	@Override
	public boolean decodeSaveToFile(String decode, String filename) {
		String s = decode(decode);

		try {
			output = new PrintStream(new File(filename));
			output.println(s);
			output.close();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean encodeSaveToFile(String encode, String filename) {
		String s = encode(encode);
		

		try {
			output = new PrintStream(new File(filename));
			output.println(s);
			output.close();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
