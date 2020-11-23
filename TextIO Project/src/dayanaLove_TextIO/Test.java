package dayanaLove_TextIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	
		Index index = new Index("/Users/Featherberry/Desktop/TextIOInput.txt");
		System.out.println(index.listArray());
		index.addWord("Apple");
		System.out.println(index.listArray());
	    index.writeIndexToFile("test4");
        
		
		
	}

	
			
			
		
	



}
	
	

