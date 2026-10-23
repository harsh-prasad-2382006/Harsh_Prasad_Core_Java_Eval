package q13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\sunit\\OneDrive\\Desktop\\Harsh_Prasad\\Java_Eval\\src\\q13\\info");
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}
}


