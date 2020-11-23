package dayanaLove_TextIO;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Scanner;

public class Index {

String inputFileName;
ArrayList <String> list = new ArrayList<String>();



Index(String inputFileName){
	this.inputFileName = inputFileName;
}
	
	

public ArrayList<String> listArray() throws FileNotFoundException {
	
// converts text file to list array	
    File file = new File(inputFileName);
    Scanner scan = new Scanner(file);

    while(scan.hasNextLine()) {
            list.add(scan.nextLine());
    }

    ListIterator<String> iterator = list.listIterator();
// makes list lower case 
while (iterator.hasNext())
{
    iterator.set(iterator.next().toLowerCase());
}
// sorts by alphabetical order 
scan.close();
Collections.sort(list);

// removes duplicates 
LinkedHashSet<String> hashSet = new LinkedHashSet<>(list);
ArrayList<String> duplicateFreeList = new ArrayList<>(hashSet);

list = duplicateFreeList;
return duplicateFreeList;
}





public void getIndexLength(){
   System.out.print(list.size());
}
	
public boolean addWord(String newWord){
	
  if (list.contains(newWord)){
	  return false;
  } else if (!list.contains(newWord))
	list.add(newWord);
    return true;
		 	
}


public boolean containsWord(String word){
	
	  if (list.contains(word)){
		  return true;
	  } 
	    return false;		 	
	}



public void writeIndexToFile(String outputFileName) throws IOException {
	
	FileWriter writer = new FileWriter(outputFileName); 
	for(String str: list) {
	  writer.write(str + System.lineSeparator());
	}
	
	writer.close();
	
}




}
