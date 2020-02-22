/**
 * 
 */
package cs143.eelradie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		   MorseConverter mc = new MorseConverter("MorseCodeTable.txt");
			
		    String workingDir = System.getProperty("user.dir") + "/";
		  
		    mc.printKeyValuePairs();
		    String fileName = "Quote2.txt";
		    String copyfileName = "Quote2Copy.txt";
		    String saveFileName = "Quote2Morse.txt";
		   	StringBuilder sb = new StringBuilder();
		    try (BufferedReader br = new BufferedReader(new FileReader(workingDir + fileName))) {
				String line = "";
				
				while ((line = br.readLine()) != null) {
					
					sb.append(line);
					
				}
			}catch (FileNotFoundException e) {
				 System.out.print(workingDir + fileName + " File Not found");
				
			} 
			catch (IOException e) {
				e.printStackTrace();
				
			}
		    mc.encodeSaveToFile(sb.toString(), workingDir + saveFileName);
		    String encodeCopy = mc.encode(sb.toString());
		    mc.decodeSaveToFile(encodeCopy, workingDir + copyfileName);
			
	}

}
