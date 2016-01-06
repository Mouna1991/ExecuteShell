package commits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testt {

	public static void main(String[] args) {

		
		String s="/Users/mouna/Documents/Research/test/src/test/test2.java";
		
		//in mac oxs
		String command = "javac "+s;
		
	
		
		String output = executeCommand(command);

		System.out.println(output);

	}

	private static String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

}
