package readdatafrompropfile;

import java.io.FileReader;
import java.io.IOException;
//import java.util.Properties;

public class ReadPropertyFile {

	//private static final String Properties = null;

	public static void main(String[] args) throws IOException {
		// Create an object of class file reader
		
		FileReader fr = new FileReader("C:\\Users\\zelal\\eclipse-workspace\\readdatafrompropfile\\src\\readdatafrompropfile\\prope.Property");
		
		// Create an object of property Class
		//Properties obj = new Properties ();
		java.util.Properties objproper = new java.util.Properties();
		// Load the file 
		objproper.load(fr);
		
		// use get method to get the file 
		System.out.println(objproper.getProperty("url"));
		System.out.println(objproper.getProperty("name"));
		System.out.println(objproper.getProperty("test"));
		System.out.println(objproper.getProperty("username"));
		//System.out.println(system.getproperty(user.dir));
		
		
		
		
	}

}
