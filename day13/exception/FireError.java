package org.day13.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FireError {

	private int [] list;
	private static final int SIZE = 10;
	
	public FireError() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = i;
		}
		writeList();
	}
	private void writeList() {
		PrintWriter out = null;
		try {
			out = PrintWriter(new FileWriter("outfile.txt"));
			for (int i = 0; i<SIZE; i++)
				out.println("배열 원소"+i+" = "+list[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException : ");
		} catch (IOException e) {
			System.err.println("IOException");
		} finally {
			if (out!=null) 
				out.close();
		}
	}
	private PrintWriter PrintWriter(FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		new FireError();
	}

}
