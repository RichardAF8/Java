package cs143.eelradie;

public interface Converter {

	//public Converter(String encodingfile); << good idea
	/**
	 * Prints a list of the key values pairs used to encode and decode strings.
	 * 
	 */
	public void printKeyValuePairs();
	
	/**
	 * Encodes a string based on the Key Value Pairs.
	 * For Example if the encode file contained Morse code
	 *  the letter a would be replaced with .- wherever it was in the string  
	 * @param  textToEncode the String to encode
     * @return returns the encoded version of the string
	 */
	public String encode(String textToEncode);
	
	/**
	 * Encodes a string based on the Key Value Pairs.
	 * For Example if the encode file contained Morse code .-
	 *  it would be replaced with a wherever it was in the string  
	 * @param  textToDecode the String to decode
     * @return returns the decode version of the string
	 */
	public String decode(String textToDecode);
	
	//private boolean saveToFile(String textToSave, String saveToFile )
	
	/**
	 * Encodes a string based on the Key Value Pairs.
	 * For Example if the encode file contained Morse code .-
	 *  it would be replaced with a wherever it was in the string  
	 * @param  textToDecode the String to decode
	 * @param  filename the file to save the decoded string in
     * @return returns true if the file is decoded and saved successfully
	 */
	public boolean decodeSaveToFile(String decode, String filename );
	
	/**
	 * Encodes a string based on the Key Value Pairs.
	 * For Example if the encode file contained Morse code .-
	 *  it would be replaced with a wherever it was in the string  
	 * @param  encode the String to encode
	 * @param  filename the file to save the encoded string in
     * @return returns true if the file is encoded and saved successfully
	 */
	public boolean encodeSaveToFile(String encode, String filename );
	
	
}
