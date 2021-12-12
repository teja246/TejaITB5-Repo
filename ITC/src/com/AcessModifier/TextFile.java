package com.AcessModifier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	
public void creatingTextFile() throws IOException {
	
	String file_location="C:\\javaTestingFiles\\sample.txt";
	FileWriter fw=new FileWriter(file_location);
	BufferedWriter bf=new BufferedWriter(fw);
	String[] names= {"Teja","samba","bhanu","Jayaram","kranthi"};
	
	for(String name:names){
	bf.write(name);
	bf.newLine();
	}
	
	bf.close();	
}
	
	public static void main(String[] args) throws IOException {
		TextFile tf=new TextFile();
		tf.creatingTextFile();

	}

}
