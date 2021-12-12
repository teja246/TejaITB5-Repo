package com.AcessModifier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class SampleFile {

	public void createTextFile() throws IOException {
		String file_location="C:\\javaTestingFiles\\";
		FileWriter fw=new FileWriter(file_location+"input.txt");
	//	BufferedWriter bw=new BufferedWriter(fw);
		String[] data= {"teja","samba","sai","kranthi"};
		for(String i:data) {
		fw.write(i);
		}
		fw.close();
	}
	public static void main(String[] args) throws IOException {
		SampleFile sf=new SampleFile();
		sf.createTextFile();
	}

}
